package characters.concretecharacters;

import characters.actions.heroactions.HeroCombat;
import characters.commoncharacter.CharacterClass;
import characters.commoncharacter.hero.Hero;
import constants.Direction;

public class GionnyCharacter extends Hero {
	
	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
		this.setCharacterCombat(new HeroCombat());
	}

	@Override
	public void move(Direction direction) {
		//move in direction (every character handles movement differently, some may skip 1 tile at certain time, some may skip fire etc...)
	}
}
