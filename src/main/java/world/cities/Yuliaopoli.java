package world.cities;

import constants.Dimensions;
import constants.TileType;
import world.AbstractCity;
import world.terrain.commonterrains.Tile;

public class Yuliaopoli extends AbstractCity {

	@Override
	protected void buildCity() {
		addTile(TileType.WATER, 0, 0, 0, 2);
		addTile(TileType.WATER, 3, 0, 4, 2);
		addTile(TileType.GRASS, 0, 13, 2, 19);
		addTile(TileType.FIRE, 5, 18, 5, 19);
	}

	@Override
	protected void createTileBasedOnCityImpl() {
		this.tile = new Tile[Dimensions.YULIA_CITY.getX()][Dimensions.YULIA_CITY.getY()];
	}
}
