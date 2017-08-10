package world.terrain.commonterrains;

public abstract class AbstractTile {

	private TerrainEffect terrain;
	
	private int[][] tileSize;
	
	public AbstractTile(TerrainEffect terrainEffect) {
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
	
}
