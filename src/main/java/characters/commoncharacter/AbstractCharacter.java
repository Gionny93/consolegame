package characters.commoncharacter;

import java.util.List;

import characters.actions.commonactions.CharacterCombat;
import characters.actions.commonactions.CharacterCombatActions;
import constants.DefaultStrings;
import constants.Direction;
import constants.FileNames;

public abstract class AbstractCharacter {

	private String name;

	private CharacterAttributes attributes;

	private CharacterCombatActions characterCombat;

	// test
	private List<CharacterCombat> combatActions;
	// new battle -> init arraylist, every action add to arraylist and display on
	// the right. attack history

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

	public CharacterCombatActions getCharacterCombat() {
		return characterCombat;
	}

	public void setCharacterCombat(CharacterCombatActions characterCombat) {
		this.characterCombat = characterCombat;
	}

	public List<CharacterCombat> getCombatActions() {
		return combatActions;
	}

	public void setCombatActions(List<CharacterCombat> combatActions) {
		this.combatActions = combatActions;
	}

}