package world.terrain.commonterrains;

public abstract class AbstractTile {

	private TerrainEffect terrain;
	
	private int[][] tileSize;
	
	public AbstractTile(TerrainEffect terrainEffect, int[][] tileSize) {
		this.setTileSize(tileSize);
		this.setTerrain(terrainEffect);
	}

	public TerrainEffect getTerrain() {
		return terrain;
	}

	public void setTerrain(TerrainEffect terrain) {
		this.terrain = terrain;
	}

	public int[][] getTileSize() {
		return tileSize;
	}

	public void setTileSize(int[][] tileSize) {
		this.tileSize = tileSize;
	}
	
}
