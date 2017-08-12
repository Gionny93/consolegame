package states;

import characters.commoncharacter.CharacterClass;
import characters.commoncharacter.CharactersFactory;
import game.Game;
import states.common.AbstractGameState;
import utils.GameUtils;

public class NewGame extends AbstractGameState {

	public NewGame() {
	}

	@Override
	protected void options() {
		System.out.println("\nNew Game");
		System.out.println("\nCreate new character!\n" + "Name:");
		String name = GameUtils.getInput();
		System.out.println("\nClass:\n" + "1)GIONNY - 2)DANIEL");
		String classChoice = GameUtils.getInput();

		CharacterClass characterClass = chooseClass(classChoice);

		GameUtils.saveCharacterToFile(CharactersFactory.createCharacter(name, characterClass));

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
			break;
		}
		return characterClass;
	}

	@Override
	protected void changeOnChoice(Game gameWrapper) {
		switch (gameWrapper.getChoice()) {
		case "1":
			gameWrapper.setState(new StartGame());
			break;
		default:
			break;
		}
	}

}
