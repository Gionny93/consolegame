package states;

import constants.States;
import game.Game;
import states.common.AbstractGameState;
import states.common.StatesFactory;
import utils.GameUtils;

public class PauseGame extends AbstractGameState {

	public PauseGame() {
	}

	@Override
	protected void options() {
		System.out.println("\nGame paused");
		System.out.println("\nr)resume\n" + "q)quit");
	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		switch (GameUtils.getInput()) {
		case "r":
			gameWrapper.setState(gameWrapper.getOldState());
			System.out.println("\nGame resumed\n");
			break;
		case "q":
			gameWrapper.setState(StatesFactory.createState(States.EXIGAME));
			break;
		default:
			gameWrapper.setState(StatesFactory.createState(States.PAUSEGAME));
			break;
		}
	}

}
