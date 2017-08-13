package characters.concretecharacters;

import characters.commoncharacter.CharacterClass;
import characters.commoncharacter.hero.Hero;
import constants.CombatAttacks;
import constants.Direction;

public class GionnyCharacter extends Hero {

	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
		// this.setCharacterCombat(new HeroCombat()); //as you level up you get more
		// attacks, maybe add a builder to the hero combat class

	}

	@Override
	public void move(Direction direction) {
		// move in direction (every character handles movement differently, some may
		// skip 1 tile at certain time, some may skip fire etc...)
	}

	@Override
	protected void defaultCombat() {
		// default attacks
		this.getCharacterCombat().addAttack(CombatAttacks.TACKLE);
		this.getCharacterCombat().addAttack(CombatAttacks.SPLASH);
	}

}
