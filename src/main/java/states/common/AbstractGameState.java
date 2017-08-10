package states.common;

import game.Game;

public abstract class AbstractGameState implements GameState{

	@Override
	public void changeState(Game gameWrapper) {
		changeOnChoice(gameWrapper);
	}

	protected abstract void changeOnChoice(Game gameWrapper);
	
}
