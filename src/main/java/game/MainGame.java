package game;

import world.World;
import world.cities.Yuliaopoli;

public class MainGame {
	public static void main(String[] args) {

		World world = new Yuliaopoli();
		Game game = new Game(world);
		game.gameLoop();

	}
}
