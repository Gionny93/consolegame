package characters.actions.commonactions;

import java.util.ArrayList;
import java.util.List;

import constants.CombatAttacks;

public abstract class AbstractCombat {
	private List<CharacterCombat> attacks;

	public AbstractCombat() {
		setAttacks(new ArrayList<CharacterCombat>(2));
	}

	public List<CharacterCombat> getAttacks() {
		return attacks;
	}

	public void setAttacks(List<CharacterCombat> attacks) {
		this.attacks = attacks;
	}

	public void addAttack(CombatAttacks attack) {
		this.getAttacks().add(CombatAttacksFactory.createAttack(attack));
	}
}
