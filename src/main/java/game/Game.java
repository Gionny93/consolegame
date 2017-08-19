package game;

import characters.commoncharacter.enemy.Enemy;
import characters.commoncharacter.hero.Hero;
import constants.States;
import states.ExitGame;
import states.common.GameState;
import states.common.StatesFactory;
import world.AbstractCity;

public class Game {

	private GameState gameState;

	private GameState oldState;
	
	private Hero character;
	
	private Enemy enemy;

	private String choice;
	
	private AbstractCity world;

	public Game(AbstractCity world) {
		this.setWorld(world);
		this.gameState = StatesFactory.createState(States.STARTMENU);
		oldState = null;
		setCharacter(null);
	}

	public void setState(GameState newGameState) {
		this.gameState = newGameState;
	}

	public void setStateWithInstance(GameState newGameState, GameState currentGame) {
		this.gameState = newGameState;
		oldState = currentGame;
	}

	public void gameLoop() {
		while (!(gameState instanceof ExitGame)) {
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

	public AbstractCity getWorld() {
		return world;
	}

	public void setWorld(AbstractCity world) {
		this.world = world;
	}

	public Hero getCharacter() {
		return character;
	}

	public void setCharacter(Hero character) {
		this.character = character;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

}
