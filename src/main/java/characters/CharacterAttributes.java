package characters;

import constants.FileNames;

public class CharacterAttributes {

	private int vitality;

	private int intelligence;

	private int strength;

	private int speed;

	public CharacterAttributes() {
	}

	public CharacterAttributes(int vitality, int intelligence, int strength, int speed) {
		super();
		this.vitality = vitality;
		this.intelligence = intelligence;
		this.strength = strength;
		this.speed = speed;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(vitality);
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(intelligence);
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(strength);
		builder.append(FileNames.SEPARATOR.getFileName());
		builder.append(speed);
		builder.append(FileNames.SEPARATOR.getFileName());
		return builder.toString();
	}
	
	

}
