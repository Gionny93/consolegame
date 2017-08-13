package constants;

import characters.commoncharacter.CharacterAttributes;

public enum CharacterClass {

	GIONNY(10, 12, 18, 13), DANIEL(7, 18, 8, 9), PECORA(8, 11, 3, 17), FERRARI(7, 12, 19, 14), CEVABOYZ(6, 6, 6, 25), GIOVGIO(1, 18, 1, 10), RAVE(15, 15, 15, 15);

	private CharacterAttributes characterAttributes;

	private CharacterClass(int vitality, int intelligence, int strength, int speed) {
		this.characterAttributes = new CharacterAttributes(vitality, intelligence, strength, speed);
	}

	public CharacterAttributes getCharacterAttributes() {
		return this.characterAttributes;
	}
}
