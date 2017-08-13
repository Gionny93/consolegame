package states;

import org.apache.commons.lang3.StringUtils;

import characters.commoncharacter.CharacterClass;
import characters.commoncharacter.CharactersFactory;
import characters.commoncharacter.hero.Hero;
import constants.DefaultStrings;
import constants.States;
import game.Game;
import states.common.AbstractGameState;
import states.common.StatesFactory;
import utils.GameUtils;

public class NewGame extends AbstractGameState {

	private Hero character;

	public NewGame() {
	}

	@Override
	protected void options() {
		System.out.println("\nNew Game");
		System.out.println("\nCreate new character!\n" + "Name:");
		String name = GameUtils.getInput();
		if (name.equals(StringUtils.EMPTY)) {
			name = DefaultStrings.DEFAULT_NAME.getDefaultName();
		}
		System.out.println("\nClass:\n" + "1)GIONNY - 2)DANIEL - Default GIONNY");
		String classChoice = GameUtils.getInput();

		CharacterClass characterClass = chooseClass(classChoice);

		this.character = CharactersFactory.createHero(name, characterClass);

		GameUtils.saveCharacterToFile(character);

		System.out.println("\nCharacter Created!!!\n");
		System.out.println("1)Start Game!\n");
	}

	private CharacterClass chooseClass(String classChoice) {
		CharacterClass characterClass = null;

		switch (classChoice) {
		case "1":
			characterClass = CharacterClass.GIONNY;
			break;
		case "2":
			characterClass = CharacterClass.DANIEL;
			break;
		default:
			characterClass = CharacterClass.GIONNY;
			break;
		}
		return characterClass;
	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		switch (gameWrapper.getChoice()) {
		case "1":
			gameWrapper.setCharacter(this.character);
			gameWrapper.setState(StatesFactory.createState(States.STARGAME));
			break;
		default:
			break;
		}
	}

}
