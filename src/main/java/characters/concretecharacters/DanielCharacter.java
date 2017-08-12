package characters.concretecharacters;

import characters.commoncharacter.AbstractCharacter;
import characters.commoncharacter.CharacterClass;
import constants.Direction;

public class DanielCharacter extends AbstractCharacter{
	
	public DanielCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.DANIEL);
		this.setAttributes(CharacterClass.DANIEL.getCharacterAttributes());
	}

	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
		
	}

}
