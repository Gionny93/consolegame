package states;

import constants.Direction;
import game.Game;
import states.common.AbstractGameState;
import utils.GameUtils;

public class StartGame extends AbstractGameState {

	public StartGame() {
		// load game from file
		// handle loading in another class LoadingGame
	}

	@Override
	protected void options() {
		System.out.println("\nGame started");
		System.out.println("\nwasd) move\n" + "p) pause\n" + "q) quit");
	}

	protected void changeOnChoice(Game gameWrapper) {
		// gameWrapper.getWorld().showWorldGUI();
		switch (gameWrapper.getChoice()) {
		case "w":
			gameWrapper.getCharacter().move(Direction.UP);
			System.out.println("Moving up");
			break;
		case "a":
			gameWrapper.getCharacter().move(Direction.LEFT);
			System.out.println("Moving left");
			break;
		case "s":
			gameWrapper.getCharacter().move(Direction.DOWN);
			System.out.println("Moving down");
			break;
		case "d":
			gameWrapper.getCharacter().move(Direction.RIGHT);
			System.out.println("Moving right");
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
