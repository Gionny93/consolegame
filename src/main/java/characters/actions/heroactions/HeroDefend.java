package characters.actions.heroactions;

import characters.actions.commonactions.CharacterCombat;
import characters.actions.commonactions.CharacterCombatActions;

public class HeroDefend implements CharacterCombat {

	private CharacterCombatActions combatActions;

	public HeroDefend(CharacterCombatActions combatActions) {
		this.combatActions = combatActions;
	}

	@Override
	public void execute() {
		combatActions.defend();
	}
}
