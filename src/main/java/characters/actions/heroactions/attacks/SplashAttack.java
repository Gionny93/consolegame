package characters.actions.heroactions.attacks;

import characters.actions.commonactions.CharacterCombat;

public class SplashAttack implements CharacterCombat {

	@Override
	public String showAttackEffect() {
		return "splash splash LUL";
	}

	@Override
	public int executeAttack() {
		return 0;
	}

}
