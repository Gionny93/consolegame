package game;

import world.World;
import world.cities.Yuliaopoli;

public class MainGame {
	public static void main(String[] args) {

		World yuliaCity = new Yuliaopoli();
		System.out.println("Showing world \t ~water +grass .normal_terrain *fire");
		yuliaCity.showWorldGUI();
		Game game = new Game(yuliaCity);
		game.gameLoop();

	}
}
