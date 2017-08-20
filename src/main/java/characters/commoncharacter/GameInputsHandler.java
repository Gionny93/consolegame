package characters.commoncharacter;

import java.awt.event.KeyEvent;

import constants.Keys;
import constants.States;
import game.Game;
import states.common.StatesFactory;

public class GameInputsHandler {

	public static void handleGameInputsKeyPressed(Game gameWrapper, KeyEvent e) {
		int key = e.getKeyCode();
		if (Keys.PAUSE.containsKey(key)) {
			gameWrapper.setStateWithInstance(StatesFactory.createState(States.PAUSEGAME), gameWrapper.getOldState());
		} else {
			gameWrapper.getCharacter().getCharacterMovement().keyPressed(e);
		}
	}

	public static void handleGameInputsKeyReleased(Game gameWrapper, KeyEvent e) {
		int key = e.getKeyCode();
		if (Keys.PAUSE.containsKey(key)) {
			// TODO
		} else {
			gameWrapper.getCharacter().getCharacterMovement().keyReleased(e);
		}
	}

}
