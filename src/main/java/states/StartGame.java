package states;

import java.awt.EventQueue;

import game.Game;
import gameboard.MainBoard;
import states.common.AbstractGameState;
import utils.GameUtils;

public class StartGame extends AbstractGameState {

	public StartGame() {

		// load game from file
		// handle loading in another class LoadingGame
	}

	@Override
	protected void options() {
		System.out.println("\nGame started");
		//System.out.println("\nwasd) move\n" + "p) pause\n" + "q) quit");
	}

	protected void changeOnChoice(Game gameWrapper) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				MainBoard mainBoard = new MainBoard(gameWrapper);
				mainBoard.setVisible(true);
				// handle action, for now blocking infinite loop with getinput
			}
		});
		
		switch (GameUtils.getInput()) {
		/*
		case "p":
			gameWrapper.setStateWithInstance(StatesFactory.createState(States.PAUSEGAME), this);
			break;
		case "q":
			gameWrapper.setState(StatesFactory.createState(States.EXIGAME));
			break;*/
		default:
			break;
		}
	}

}
