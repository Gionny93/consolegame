package game;

import characters.commoncharacter.hero.Hero;

public class GameSaveStructure {
	
	private Hero character;
	
	public GameSaveStructure() {
	}

	public GameSaveStructure(Hero character) {
		super();
		this.character = character;
	}

	public Hero getCharacter() {
		return character;
	}

	public void setCharacter(Hero character) {
		this.character = character;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getCharacter().toString());
		return builder.toString();
	}
}
