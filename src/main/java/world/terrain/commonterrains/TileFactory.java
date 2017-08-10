package world.terrain.commonterrains;

import java.util.HashMap;
import java.util.Map;

import constants.TileType;
import world.terrain.FireTile;
import world.terrain.GrassTile;
import world.terrain.GroundTile;
import world.terrain.WaterTile;
import world.terrain.terrainswitheffect.BurningTerrain;
import world.terrain.terrainswitheffect.NoEffectsTerrain;
import world.terrain.terrainswitheffect.WaterTerrain;

public class TileFactory {

	private static final Map<TileType, AbstractTile> tilesMap = new HashMap<>();

	public static AbstractTile getTile(TileType tileType) {
		AbstractTile tile = (AbstractTile) tilesMap.get(tileType);

		if (tile == null) {
			tile = TileCreator.createTile(tileType);
			tilesMap.put(tileType, tile);
			System.out.println("creating tile of type " + tileType.name());
		}
		return tile;
	}

	private static class TileCreator {
		public static AbstractTile createTile(TileType tileType) {
			AbstractTile tile = null;
			switch (tileType) {
			case WATER:
				tile = new WaterTile(new WaterTerrain());
				break;
			case NORMAL_TERRAIN:
				tile = new GroundTile(new NoEffectsTerrain());
				break;
			case FIRE:
				tile = new FireTile(new BurningTerrain());
				break;
			case GRASS:
				tile = new GrassTile(new NoEffectsTerrain());
				break;
			default:
				break;
			}
			return tile;
		}
	}

}
