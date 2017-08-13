package characters.commoncharacter.enemy;

import characters.actions.commonactions.EnemyCombat;
import characters.commoncharacter.AbstractCharacter;

public class Enemy extends AbstractCharacter {

	private EnemyCombat enemyCombat;

	public Enemy(String name) {
		super(name);
	}

	public EnemyCombat getEnemyCombat() {
		return enemyCombat;
	}

	public void setEnemyCombat(EnemyCombat enemyCombat) {
		this.enemyCombat = enemyCombat;
	}

}
