package states;

import game.Game;
import states.common.AbstractGameState;

public class StartGame extends AbstractGameState {

	public StartGame() {
		System.out.println("\nGame started");
		mainGameOptions();
	}

	private void mainGameOptions() {
		System.out.println(
				"\nwasd) move\n" + 
				"p) pause\n" + 
				"q) quit");
	}

	protected void changeOnChoice(Game gameWrapper) {
		switch (gameWrapper.getChoice()) {
		case "w":
		case "a":
		case "s":
		case "d":
			System.out.println("moving LUL");
			break;
		case "p":
			gameWrapper.setStateWithInstance(new PauseGame(), this);
			break;
		case "q":
			gameWrapper.setState(new ExitGame());
			break;
		}
	}

}
