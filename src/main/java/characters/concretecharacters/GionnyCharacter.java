package characters.concretecharacters;

import characters.commoncharacter.AbstractCharacter;
import characters.commoncharacter.CharacterClass;

public class GionnyCharacter extends AbstractCharacter {

	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
	}
}
