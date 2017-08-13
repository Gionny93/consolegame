package characters.concretecharacters;

import characters.commoncharacter.hero.Hero;
import constants.CharacterClass;
import constants.CombatAttacks;
import constants.Direction;

public class GionnyCharacter extends Hero {

	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
		// as you level up you get more attacks
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
