package characters.commoncharacter;

import characters.actions.commonactions.AbstractCombat;
import constants.DefaultStrings;
import constants.Direction;
import constants.FileNames;

public abstract class AbstractCharacter {

	private String name;

	private CharacterAttributes attributes;

	private AbstractCombat characterCombat;

	public AbstractCharacter() {
		this.name = DefaultStrings.DEFAULT_NAME.getDefaultName();
	}

	public AbstractCharacter(String name) {
		this.name = name;
	}

	public void move(Direction direction) {
		// move in direction (every character handles movement differently, some may
		// skip 1 tile at certain time, some may skip fire etc...)
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getName());
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(this.getAttributes().toString());
		return builder.toString();
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

}