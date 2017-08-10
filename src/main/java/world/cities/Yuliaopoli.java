package world.cities;

import constants.TileType;
import world.World;

public class Yuliaopoli extends World {

	@Override
	protected void buildCity() {
		addTile(TileType.WATER, 0, 0, 0, 2);
		addTile(TileType.WATER, 3, 0, 4, 2);
		addTile(TileType.GRASS, 0, 13, 2, 19);
		addTile(TileType.FIRE, 5, 18, 5, 19);
	}
}
