package characters.actions.enemyactions;

import characters.actions.commonactions.CharacterCombatActions;

public class EnemyCombat implements CharacterCombatActions {

	@Override
	public void attack() {
		System.out.println("Enemy attacking");
	}

	@Override
	public void defend() {
		System.out.println("Enemy defending");
	}

}
