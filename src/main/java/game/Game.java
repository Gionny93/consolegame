package game;

import states.ExitGame;
import states.StartGame;
import states.StartMenu;
import states.common.GameState;
import world.World;

public class Game {

	private GameState gameState;

	private GameState oldState;

	private String choice;
	
	private World world;

	public Game(World world) {
		this.setWorld(world);
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
			this.setChoice(GameUtils.getInput());
			this.gameState.changeState(this);
		}
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

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
