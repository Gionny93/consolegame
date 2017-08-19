package characters.commoncharacter.hero.movement;

import java.awt.event.KeyEvent;

import characters.commoncharacter.SpriteHandler;

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
		switch (key) {
		case KeyEvent.VK_LEFT:
			this.getSpriteHandler().setDx(-1);
			break;
		case KeyEvent.VK_RIGHT:
			this.getSpriteHandler().setDx(1);
			break;
		case KeyEvent.VK_UP:
			this.getSpriteHandler().setDy(-1);
			break;
		case KeyEvent.VK_DOWN:
			this.getSpriteHandler().setDy(1);
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_LEFT:
			this.getSpriteHandler().setDx(0);
			break;
		case KeyEvent.VK_RIGHT:
			this.getSpriteHandler().setDx(0);
			break;
		case KeyEvent.VK_UP:
			this.getSpriteHandler().setDy(0);
			break;
		case KeyEvent.VK_DOWN:
			this.getSpriteHandler().setDy(0);
			break;
		default:
			break;
		}
	}

	public SpriteHandler getSpriteHandler() {
		return spriteHandler;
	}

	public void setSpriteHandler(SpriteHandler spriteHandler) {
		this.spriteHandler = spriteHandler;
	}
}
