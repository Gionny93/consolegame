package game;

import world.World;

public class MainGame {

	public static void main(String[] args) {
		//AbstractCity yuliaCity = new Yuliaopoli();
		//System.out.println("Showing world \t ~water +grass .normal_terrain fire");
		//yuliaCity.showWorldGUI();
		World world= new World();
		Game game = new Game(world);
		game.gameLoop();
	}
}
