package characters.actions.enemyactions;

import characters.actions.commonactions.CharacterCombat;
import characters.actions.commonactions.CharacterCombatActions;

public class EnemyDefend implements CharacterCombat {

	private CharacterCombatActions combatActions;

	public EnemyDefend(CharacterCombatActions combatActions) {
		this.combatActions = combatActions;
	}

	@Override
	public void execute() {
		combatActions.defend();
	}

}
