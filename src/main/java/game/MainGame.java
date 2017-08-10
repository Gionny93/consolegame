package game;

import constants.TileType;
import world.World;

public class MainGame {
	public static void main(String[] args) {
		
		World world = new World();
//		world.addTile(TileType.FIRE, 0, 0, 3, 3);
//		world.addTile(TileType.WATER, 0, 6, 2, 8);
//		world.showWorldGUI();
//		System.out.println(world.getWorld()[3][3]);
//		
		Game game = new Game(world);
		game.gameLoop();
		
	}
}
