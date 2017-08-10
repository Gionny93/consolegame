package states;

import game.Game;
import states.common.AbstractGameState;

public class ExitGame extends AbstractGameState {

	public ExitGame() {
		System.out.println("\nGame exited");
	}

	@Override
	public void changeState(Game gameWrapper) {

	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		// TODO Auto-generated method stub
		
	}

}
