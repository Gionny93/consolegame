package characters.commoncharacter;

import characters.actions.commonactions.AbstractCombat;
import characters.commoncharacter.hero.movement.AbstractMovement;
import constants.DefaultStrings;
import constants.FileNames;

public abstract class AbstractCharacter {

	private String name;

	private CharacterAttributes attributes;

	private AbstractCombat characterCombat;

	private AbstractMovement characterMovement;

	private SpriteHandler sprite;
	
	public AbstractCharacter() {
		this.name = DefaultStrings.DEFAULT_NAME.getDefaultName();
	}

	public AbstractCharacter(String name) {
		this.name = name;
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


	public AbstractMovement getCharacterMovement() {
		return characterMovement;
	}

	public void setCharacterMovement(AbstractMovement characterMovement) {
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

	public SpriteHandler getSprite() {
		return sprite;
	}

	public void setSprite(SpriteHandler sprite) {
		this.sprite = sprite;
	}

}