package characters.commoncharacter.hero.movement;

import characters.commoncharacter.SpriteHandler;

public class DoubleSpeedHeroMovement extends AbstractMovement {

	public DoubleSpeedHeroMovement(SpriteHandler spriteHandler) {
		super(spriteHandler);
		this.speed = 5;
	}
	
}
