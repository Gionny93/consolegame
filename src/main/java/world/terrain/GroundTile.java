package world.terrain;

import world.terrain.commonterrains.AbstractTile;
import world.terrain.commonterrains.TerrainEffect;

public class GroundTile extends AbstractTile{

	public GroundTile(TerrainEffect terrainEffect, int[][] tileSize) {
		super(terrainEffect, tileSize);
	}

}
