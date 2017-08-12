package states;

import game.Game;
import states.common.AbstractGameState;

public class ExitGame extends AbstractGameState {

	public ExitGame() {
		System.out.println("\nGame exited");
	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void options() {
		// TODO Auto-generated method stub
		
	}

}
