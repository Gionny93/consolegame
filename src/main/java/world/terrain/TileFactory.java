package world.terrain;

import java.util.HashMap;
import java.util.Map;

import constants.Dimensions;
import constants.TileType;
import world.terrain.commonterrains.AbstractTile;
import world.terrain.terrainswitheffect.BurningTerrain;
import world.terrain.terrainswitheffect.NoEffectsTerrain;
import world.terrain.terrainswitheffect.WaterTerrain;

public class TileFactory {

	private static final Map<TileType, AbstractTile> tilesMap = new HashMap<>();

	public static AbstractTile getTile(TileType tileType) {
		AbstractTile tile = (AbstractTile) tilesMap.get(tileType);

		if (tile == null) {
			tile = TileCreator.createTile(tileType, TileCreator.defaultTileSize());
			tilesMap.put(tileType, tile);
			System.out.println("creating tile of type " + tileType.name());
		}
		return tile;
	}

	private static class TileCreator {
		public static AbstractTile createTile(TileType tileType, int[][] tileSize) {
			AbstractTile tile = null;
			switch (tileType) {
			case WATER:
				tile = new WaterTile(new WaterTerrain(), tileSize);
				break;
			case NORMAL_TERRAIN:
				tile = new GroundTile(new NoEffectsTerrain(), tileSize);
				break;
			case FIRE:
				tile = new FireTile(new BurningTerrain(), tileSize);
				break;
			case GRASS:
				tile = new GrassTile(new NoEffectsTerrain(), tileSize);
				break;
			default:
				break;
			}
			return tile;
		}

		public static int[][] defaultTileSize() {
			return new int[Dimensions.DEFAULTS_TILE.getX()][Dimensions.DEFAULTS_TILE.getY()];
		}
	}

}
