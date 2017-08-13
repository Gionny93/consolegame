package characters.actions.heroactions.attacks;

import characters.actions.commonactions.CharacterCombat;

public class TackleAttack implements CharacterCombat {

	@Override
	public String showAttackEffect() {
		return "very weak tackle lul";
	}

	@Override
	public int executeAttack() {
		// define enum with base damage for each skill
		return 2;
	}

}
