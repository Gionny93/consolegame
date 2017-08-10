package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import states.ExitGame;
import states.StartGame;
import states.StartMenu;
import states.common.GameState;

public class Game {

	private GameState gameState;

	private GameState oldState;

	private String choice;

	public Game() {
		this.gameState = new StartMenu();
		oldState = null;
	}

	public void setState(GameState newGameState) {
		this.gameState = newGameState;
	}

	public void setStateWithInstance(GameState newGameState, StartGame currentGame) {
		this.gameState = newGameState;
		oldState = currentGame;
	}

	public void gameLoop() {
		while (!(gameState instanceof ExitGame)) {
			this.setChoice(getInput());
			this.gameState.changeState(this);
		}
	}

	static String getInput() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public GameState getOldState() {
		return oldState;
	}

	public void setOldState(GameState oldState) {
		this.oldState = oldState;
	}

}
