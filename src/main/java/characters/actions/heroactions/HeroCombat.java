package characters.actions.heroactions;

import characters.actions.commonactions.CharacterCombatActions;

public class HeroCombat implements CharacterCombatActions {

	@Override
	public void attack() {
		System.out.println("hero attacking");
	}

	@Override
	public void defend() {
		System.out.println("hero defending");
	}

}
