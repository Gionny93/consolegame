package states;

import game.Game;
import states.common.AbstractGameState;

public class PauseGame extends AbstractGameState {

	public PauseGame() {
		System.out.println("\nGame paused");
		pauseOptions();
	}
	
	private void pauseOptions() {
		System.out.println(
				"\nr)resume\n"
			  + "q)quit");
	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		switch(gameWrapper.getChoice()) {
		case "r":
			gameWrapper.setState(gameWrapper.getOldState());
			System.out.println("\nGame resumed\n");
			break;
		case "q":
			gameWrapper.setState(new ExitGame());
			break;
		default:
			gameWrapper.setState(new PauseGame());
			break;
		}
	}

}
