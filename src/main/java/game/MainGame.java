package game;

import world.World;

public class MainGame {
	public static void main(String[] args) {
		
		World world = new World();
	//	world.showWorldGUI();
	//	world.addTile(TileType.WATER, new int[3][1], new int[0][0]);
		
		Game game = new Game(world);
		game.gameLoop();
		
	}
}
