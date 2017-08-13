package characters.actions.heroactions;

import characters.actions.commonactions.AbstractCombat;
import characters.actions.commonactions.CharacterCombat;

public class HeroCombat extends AbstractCombat{
	
	public void showAttacks() {
		for (CharacterCombat attack : getAttacks()) {
			System.out.println("**********************" + attack.showAttackEffect() + ", damage -> "
					+ attack.executeAttack() + "**********************");

		}
	}


}
