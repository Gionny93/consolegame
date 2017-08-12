package game;

import characters.commoncharacter.AbstractCharacter;

public class GameSaveStructure {
	
	private AbstractCharacter character;
	
	public GameSaveStructure() {
	}

	public GameSaveStructure(AbstractCharacter character) {
		super();
		this.character = character;
	}

	public AbstractCharacter getCharacter() {
		return character;
	}

	public void setCharacter(AbstractCharacter character) {
		this.character = character;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getCharacter().toString());
		return builder.toString();
	}
}
