package characters.concretecharacters;

import characters.commoncharacter.CharacterClass;
import characters.commoncharacter.hero.Hero;

public class DanielCharacter extends Hero {

	public DanielCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.DANIEL);
		this.setAttributes(CharacterClass.DANIEL.getCharacterAttributes());
		// this.setCharacterCombat(new HeroCombat());
	}

	@Override
	protected void defaultCombat() {
		// TODO Auto-generated method stub

	}
}
