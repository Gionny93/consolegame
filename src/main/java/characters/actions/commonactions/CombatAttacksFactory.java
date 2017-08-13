package characters.actions.commonactions;

import characters.actions.heroactions.attacks.SplashAttack;
import characters.actions.heroactions.attacks.TackleAttack;
import constants.CombatAttacks;

public class CombatAttacksFactory {

	public static CharacterCombat createAttack(CombatAttacks attack) {
		CharacterCombat characterCombat = null;
		switch (attack) {
		case TACKLE:
			characterCombat = new TackleAttack();
			break;
		case SPLASH:
			characterCombat = new SplashAttack();
			break;
		default:
			break;
		}
		return characterCombat;
	}

}
