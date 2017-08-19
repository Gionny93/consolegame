package characters.commoncharacter.hero.movement;

import java.awt.event.KeyEvent;

import characters.commoncharacter.SpriteHandler;
import constants.Direction;

public abstract class AbstractMovement implements CharacterMovement {

	private SpriteHandler spriteHandler;

	public AbstractMovement(SpriteHandler spriteHandler) {
		this.setSpriteHandler(spriteHandler);
	}

	@Override
	public void move() {
		this.getSpriteHandler().setX(this.getSpriteHandler().getX() + this.getSpriteHandler().getDx());
		this.getSpriteHandler().setY(this.getSpriteHandler().getY() + this.getSpriteHandler().getDy());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (Direction.LEFT.containsKey(key)) {
			this.getSpriteHandler().setDx(-1);
		}
		if (Direction.RIGHT.containsKey(key)) {
			this.getSpriteHandler().setDx(1);
		}
		if (Direction.UP.containsKey(key)) {
			this.getSpriteHandler().setDy(-1);
		}
		if (Direction.DOWN.containsKey(key)) {
			this.getSpriteHandler().setDy(1);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (Direction.LEFT.containsKey(key)) {
			this.getSpriteHandler().setDx(0);
		}
		if (Direction.RIGHT.containsKey(key)) {
			this.getSpriteHandler().setDx(0);
		}
		if (Direction.UP.containsKey(key)) {
			this.getSpriteHandler().setDy(0);
		}
		if (Direction.DOWN.containsKey(key)) {
			this.getSpriteHandler().setDy(0);
		}
	}

	public SpriteHandler getSpriteHandler() {
		return spriteHandler;
	}

	public void setSpriteHandler(SpriteHandler spriteHandler) {
		this.spriteHandler = spriteHandler;
	}
}
