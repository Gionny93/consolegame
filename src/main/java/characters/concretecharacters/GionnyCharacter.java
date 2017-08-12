package characters.concretecharacters;

import characters.commoncharacter.AbstractCharacter;
import characters.commoncharacter.CharacterClass;
import constants.Direction;

public class GionnyCharacter extends AbstractCharacter {

	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
	}

	@Override
	public void move(Direction direction) {
		//move in direction (every character handles movement differently, some may skip 1 tile at certain time, some may skip fire etc...)
	}
}
