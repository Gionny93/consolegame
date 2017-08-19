package world;

import constants.Dimensions;
import constants.TileType;
import world.terrain.FireTile;
import world.terrain.GrassTile;
import world.terrain.GroundTile;
import world.terrain.WaterTile;
import world.terrain.commonterrains.Tile;
import world.terrain.commonterrains.TileFactory;

public abstract class AbstractCity {

	protected Tile[][] tile;

	public AbstractCity() {
		createTileBasedOnCityImpl();
		baseTile();
		buildCity();
	}

	protected abstract void createTileBasedOnCityImpl();

	protected abstract void buildCity();

	protected void addTile(TileType tileType, int initX, int initY, int finX, int finY) {
		if (initX <= finX && initY <= finY && initX <= Dimensions.YULIA_CITY.getX()
				&& finX <= Dimensions.YULIA_CITY.getX() && initY <= Dimensions.YULIA_CITY.getY()
				&& finY <= Dimensions.YULIA_CITY.getY()) {
			for (int i = initX; i <= finX; i++) {
				for (int j = initY; j <= finY; j++) {
					tile[i][j] = TileFactory.getTile(tileType);
				}
			}
		}
	}

	protected void baseTile() {
		for (int i = 0; i < tile.length; i++) {
			for (int j = 0; j < tile[i].length; j++) {
				tile[i][j] = TileFactory.getTile(TileType.NORMAL_TERRAIN);
			}
		}
	}

	public void showWorldGUI() {
		for (int i = 0; i < tile.length; i++) {
			// showTile(world[i][0]);
			for (int j = 0; j < tile[i].length; j++) {
				showTile(tile[i][j]);
			}
			System.out.println("\n");
		}
	}

	private void showTile(Tile abstractTile) {
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

	public Tile[][] getWorld() {
		return tile;
	}

	public void setWorld(Tile[][] world) {
		this.tile = world;
	}

}
