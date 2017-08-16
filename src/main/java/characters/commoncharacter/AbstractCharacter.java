package characters.commoncharacter;

import characters.actions.commonactions.AbstractCombat;
import characters.commoncharacter.hero.movement.CharacterMovement;
import constants.DefaultStrings;
import constants.Direction;
import constants.FileNames;

public abstract class AbstractCharacter {

	private String name;

	private CharacterAttributes attributes;

	private AbstractCombat characterCombat;

	private CharacterMovement characterMovement;

	public AbstractCharacter() {
		this.name = DefaultStrings.DEFAULT_NAME.getDefaultName();
	}

	public AbstractCharacter(String name) {
		this.name = name;
	}

	public void move(Direction direction) {
		this.characterMovement.move(direction);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CharacterAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(CharacterAttributes attributes) {
		this.attributes = attributes;
	}

	public AbstractCombat getCharacterCombat() {
		return characterCombat;
	}

	public void setCharacterCombat(AbstractCombat characterCombat) {
		this.characterCombat = characterCombat;
	}

	public CharacterMovement getCharacterMovement() {
		return characterMovement;
	}

	public void setCharacterMovement(CharacterMovement characterMovement) {
		this.characterMovement = characterMovement;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getName());
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(this.getAttributes().toString());
		return builder.toString();
	}

}