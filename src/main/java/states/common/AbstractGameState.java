package states.common;

import game.Game;

public abstract class AbstractGameState implements GameState{
	
	public AbstractGameState() {
		options();
	}


	@Override
	public void changeState(Game gameWrapper) {
		changeOnChoice(gameWrapper);
	}

	protected abstract void options();

	protected abstract void changeOnChoice(Game gameWrapper);
	
}
