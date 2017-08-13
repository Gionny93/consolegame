package characters.actions.heroactions;

import characters.actions.commonactions.CharacterCombat;
import characters.actions.commonactions.CharacterCombatActions;

public class HeroAttack implements CharacterCombat {

	private CharacterCombatActions combatActions;
	
	public HeroAttack(CharacterCombatActions combatActions) {
		this.combatActions = combatActions;
	}

	@Override
	public void execute() {
		combatActions.attack();
	}
}
