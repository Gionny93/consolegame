package world.terrain.commonterrains;

public class Tile {

	private TerrainEffect terrain;

	//add image for each tile obj
	//private Image tileSprite;

	public Tile(TerrainEffect terrainEffect) {
		this.setTerrain(terrainEffect);
	}

	public TerrainEffect getTerrain() {
		return terrain;
	}

	public void setTerrain(TerrainEffect terrain) {
		this.terrain = terrain;
	}
}
