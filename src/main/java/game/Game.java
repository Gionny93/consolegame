package game;

import characters.commoncharacter.hero.Hero;
import constants.States;
import states.ExitGame;
import states.common.GameState;
import states.common.StatesFactory;
import world.World;
/**
 * 
 * @author shireenx
 *
 *enemies coming from top of the screen, if you dont avoid them u gotta battle, pokimon style, every x enemies there's a boss.
 *you get exp from killing stuff, as you get levels u get new spells, think of something not boring to do with new spell, like combinations or smthing
 */
public class Game {

	private GameState gameState;

	private GameState oldState;

	private Hero character;

	private String choice;

	private World world;

	public Game(World world) {
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

	public Hero getCharacter() {
		return character;
	}

	public void setCharacter(Hero character) {
		this.character = character;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
