package characters.commoncharacter.hero.movement;

import characters.commoncharacter.SpriteHandler;

public class DoubleSpeedHeroMovement extends AbstractMovement {

	public DoubleSpeedHeroMovement(SpriteHandler spriteHandler) {
		super(spriteHandler);
	}

	@Override
	public void move() {
		this.getSpriteHandler().setX(this.getSpriteHandler().getX() + this.getSpriteHandler().getDx() * 2);
		this.getSpriteHandler().setY(this.getSpriteHandler().getY() + this.getSpriteHandler().getDy() * 2);
	}
}
