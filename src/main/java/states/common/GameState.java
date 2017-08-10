package states.common;

import game.Game;

public interface GameState {
	void changeState(Game gameWrapper);
}
