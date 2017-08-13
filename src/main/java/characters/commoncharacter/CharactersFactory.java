package characters.commoncharacter;

import characters.commoncharacter.hero.Hero;
import characters.concretecharacters.DanielCharacter;
import characters.concretecharacters.GionnyCharacter;

public class CharactersFactory {

	public static Hero createHero(String name, CharacterClass characterClass) {
		Hero character = null;
		switch (characterClass) {
		case GIONNY:
			character = new GionnyCharacter(name);
			break;
		case DANIEL:
			character = new DanielCharacter(name);
			break;
		// add all the others
		default:
			break;
		}
		return character;
	}

}
