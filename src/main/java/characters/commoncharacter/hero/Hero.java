package characters.commoncharacter.hero;

import characters.actions.heroactions.HeroCombat;
import characters.commoncharacter.AbstractCharacter;
import characters.commoncharacter.hero.movement.DefaultHeroMovement;
import constants.CharacterClass;
import constants.FileNames;

public abstract class Hero extends AbstractCharacter {

	private CharacterClass characterClass;

	public Hero(String name) {
		super(name);
		this.setCharacterCombat(new HeroCombat());
		this.setCharacterMovement(new DefaultHeroMovement());
		defaultCombat();
	}

	protected abstract void defaultCombat();

	public CharacterClass getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getCharacterClass().name());
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(super.toString());
		return builder.toString();
	}
}
