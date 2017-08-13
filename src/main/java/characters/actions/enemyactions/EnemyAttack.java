package characters.actions.enemyactions;

import characters.actions.commonactions.CharacterCombat;
import characters.actions.commonactions.CharacterCombatActions;

public class EnemyAttack implements CharacterCombat {

	private CharacterCombatActions combatActions;

	public EnemyAttack(CharacterCombatActions combatActions) {
		this.combatActions = combatActions;
	}

	@Override
	public void execute() {
		combatActions.attack();
	}
}
