package world;

import constants.Dimensions;
import constants.TileType;
import world.terrain.FireTile;
import world.terrain.GrassTile;
import world.terrain.GroundTile;
import world.terrain.WaterTile;
import world.terrain.commonterrains.AbstractTile;
import world.terrain.commonterrains.TileFactory;

public abstract class AbstractCity {

	private AbstractTile[][] world;

	public AbstractCity() {
		world = new AbstractTile[Dimensions.WORLD_DEFAULT.getX()][Dimensions.WORLD_DEFAULT.getY()];
		baseTile();
		buildCity();
	}

	protected abstract void buildCity();

	protected void addTile(TileType tileType, int initX, int initY, int finX, int finY) {
		if (initX <= finX && initY <= finY && initX <= Dimensions.WORLD_DEFAULT.getX()
				&& finX <= Dimensions.WORLD_DEFAULT.getX() && initY <= Dimensions.WORLD_DEFAULT.getY()
				&& finY <= Dimensions.WORLD_DEFAULT.getY()) {
			for (int i = initX; i <= finX; i++) {
				for (int j = initY; j <= finY; j++) {
					world[i][j] = TileFactory.getTile(tileType);
				}
			}
		}
	}

	protected void baseTile() {
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[i].length; j++) {
				world[i][j] = TileFactory.getTile(TileType.NORMAL_TERRAIN);
			}
		}
	}

	public void showWorldGUI() {
		for (int i = 0; i < world.length; i++) {
			//showTile(world[i][0]);
			for (int j = 0; j < world[i].length; j++) {
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
		if (abstractTile instanceof GrassTile) {
			System.out.print("+");
		}
	}

	public AbstractTile[][] getWorld() {
		return world;
	}

	public void setWorld(AbstractTile[][] world) {
		this.world = world;
	}

}
