package states.common;

import constants.States;
import states.ExitGame;
import states.NewGame;
import states.PauseGame;
import states.StartGame;
import states.StartMenu;

public class StatesFactory {

	public static AbstractGameState createState(States state) {
		AbstractGameState currentState = null;
		switch (state) {
		case STARTMENU:
			currentState = new StartMenu();
			break;
		case EXIGAME:
			currentState = new ExitGame();
			break;
		case NEWGAME:
			currentState = new NewGame();
			break;
		case PAUSEGAME:
			currentState = new PauseGame();
			break;
		case STARGAME:
			currentState = new StartGame();
			break;
		default:
			break;
		}
		return currentState;
	}
}
