package characters.commoncharacter;

import characters.concretecharacters.GionnyCharacter;

public class CharactersFactory {
	
	public static AbstractCharacter createCharacter(String name, CharacterClass characterClass) {
		AbstractCharacter character = null;
		switch(characterClass) {
		case GIONNY:
			character = new GionnyCharacter(name);
			break;
		//add all the others
		default:
			break;
		}
		return character;
	}

}
