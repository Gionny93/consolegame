package characters.commoncharacter.enemy;

import characters.actions.enemyactions.EnemyCombat;
import characters.commoncharacter.AbstractCharacter;

public abstract class Enemy extends AbstractCharacter {

	public Enemy(String name) {
		super(name);
		this.setCharacterCombat(new EnemyCombat());
	}
}
