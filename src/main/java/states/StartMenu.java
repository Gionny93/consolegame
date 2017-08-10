package states;

import game.Game;
import states.common.AbstractGameState;

public class StartMenu extends AbstractGameState {
	
	
	public StartMenu() {
		startMenuMain();
	}

	private void startMenuMain() {
		System.out.println(
				  "********************MENU***********************\n"
				+ "***********************************************\n"
				+ "------------------1)START----------------------\n"
				+ "------------------2)EXIT-----------------------\n"
				+ "***********************************************\n"
				+ "***********************************************\n");
	}

	protected void changeOnChoice(Game gameWrapper) {
		switch (gameWrapper.getChoice()) {
		case "1":
			gameWrapper.setState(new StartGame());
			break;
		case "2":
			gameWrapper.setState(new ExitGame());
			break;
		default:
			gameWrapper.setState(new StartMenu());
			break;
		}
	}
}
