package game;

import world.AbstractCity;
import world.cities.Yuliaopoli;

public class MainGame {

	public static void main(String[] args) {
		AbstractCity yuliaCity = new Yuliaopoli();
		//System.out.println("Showing world \t ~water +grass .normal_terrain fire");
		//yuliaCity.showWorldGUI();
		Game game = new Game(yuliaCity);
		game.gameLoop();
	}
}
