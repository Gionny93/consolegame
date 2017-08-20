package characters.concretecharacters;

import javax.swing.ImageIcon;

import characters.commoncharacter.hero.Hero;
import characters.commoncharacter.hero.movement.DoubleSpeedHeroMovement;
import constants.CharacterClass;
import constants.CombatAttacks;

public class GionnyCharacter extends Hero {

	public GionnyCharacter(String name) {
		super(name);
		this.setCharacterClass(CharacterClass.GIONNY);
		this.setAttributes(CharacterClass.GIONNY.getCharacterAttributes());
		this.setCharacterMovement(new DoubleSpeedHeroMovement(getSprite()));
		// as you level up you get more attacks
	}

	@Override
	protected void defaultCombat() {
		// default attacks
		this.getCharacterCombat().addAttack(CombatAttacks.TACKLE);
		this.getCharacterCombat().addAttack(CombatAttacks.SPLASH);
	}

	@Override
	protected ImageIcon setCharacterIcon() {
		return new ImageIcon(getClass().getResource("/sprites/gionnyhero.png"));
	}

}
