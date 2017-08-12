package characters.commoncharacter;

import constants.DefaultStrings;
import constants.FileNames;

public abstract class AbstractCharacter implements characterCommand {

	private String name;

	private CharacterClass characterClass;

	private CharacterAttributes attributes;

	public AbstractCharacter() {
		this.name = DefaultStrings.DEFAULT_NAME.getDefaultName();
	}

	public AbstractCharacter(String name) {
		super();
		this.name = name;
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
		builder.append(this.getCharacterClass().name());
		builder.append(FileNames.SEPARATOR.getFileName());
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

	public CharacterClass getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}

}
