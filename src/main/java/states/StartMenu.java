package states;

import constants.States;
import game.Game;
import states.common.AbstractGameState;
import states.common.StatesFactory;
import utils.GameUtils;

public class StartMenu extends AbstractGameState {

	@Override
	protected void options() {
		System.out.println(
				  "********************MENU***********************\n"
				+ "***********************************************\n"
				+ "------------------1)START----------------------\n"
				+ "------------------2)EXIT-----------------------\n"
				+ "***********************************************\n"
				+ "***********************************************\n");
	}

	protected void changeOnChoice(Game gameWrapper) {
		switch (GameUtils.getInput()) {
		case "1":
			if (checkFirstTime()) {
				gameWrapper.setState(StatesFactory.createState(States.NEWGAME));
			} else {
				if (gameWrapper.getCharacter() == null) {
					gameWrapper.setCharacter(GameUtils.loadGame().getCharacter());
				}
				gameWrapper.setState(StatesFactory.createState(States.STARGAME));
			}
			break;
		case "2":
			gameWrapper.setState(StatesFactory.createState(States.EXIGAME));
			break;
		default:
			gameWrapper.setState(StatesFactory.createState(States.STARTMENU));
			break;
		}
	}

	private boolean checkFirstTime() {
		return !GameUtils.lookForSaveFiles();
	}

}
