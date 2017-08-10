package world;

import constants.Dimensions;
import constants.TileType;
import world.terrain.FireTile;
import world.terrain.GroundTile;
import world.terrain.TileFactory;
import world.terrain.WaterTile;
import world.terrain.commonterrains.AbstractTile;

public class World {

	private AbstractTile[][] world;

	public World() {
		world = new AbstractTile[Dimensions.WORLD_DEFAULT.getX()][Dimensions.WORLD_DEFAULT.getY()];
		baseTile();
	}

	public World(int x, int y) {
		this.world = new AbstractTile[x][y];
	}

	public void addTile(TileType tileType, int initX, int initY, int finX, int finY) {
		for (int i = initX; i <= finX; i++) {
			for (int j = initY; j <= finY; j++) {
				world[i][j] = TileFactory.getTile(tileType);
			}
		}
	}

	public AbstractTile[][] getWorld() {
		return world;
	}

	public void setWorld(AbstractTile[][] world) {
		this.world = world;
	}

	private void baseTile() {
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[i].length; j++) {
				world[i][j] = TileFactory.getTile(TileType.NORMAL_TERRAIN);
			}
		}
	}

	public void showWorldGUI() {
		for (int i = 0; i < world.length; i++) {
			showTile(world[i][0]);
			for (int j = 1; j < world[i].length; j++) {
				showTile(world[i][j]);
			}
			System.out.println("\n");
		}
	}

	private void showTile(AbstractTile abstractTile) {
		if (abstractTile instanceof FireTile) {
			System.out.print("*");
		}
		if (abstractTile instanceof GroundTile) {
			System.out.print(".");
		}
		if (abstractTile instanceof WaterTile) {
			System.out.print("~");
		}
	}

}
