package characters.commoncharacter.hero.movement;

import java.awt.event.KeyEvent;

import characters.commoncharacter.SpriteHandler;
import constants.Dimensions;
import constants.Direction;
import constants.Positions;
import constants.Values;

public abstract class AbstractMovement implements CharacterMovement {

	private SpriteHandler spriteHandler;

	// should be long for more precision
	protected int speed;

	public AbstractMovement(SpriteHandler spriteHandler) {
		this.setSpriteHandler(spriteHandler);
		speed = 1;
	}

	@Override
	public void move() {
		if (CollisionDetection.characterWithinGameWindow(Dimensions.WINDOW_DIM.getX(), Dimensions.WINDOW_DIM.getY(),
				getSpriteHandler())) {
			this.getSpriteHandler().setX(this.getSpriteHandler().getX() + this.getSpriteHandler().getDx() * speed);
			this.getSpriteHandler().setY(this.getSpriteHandler().getY() + this.getSpriteHandler().getDy() * speed);
		} else {
			spawnAtDefaultLocation();
		}

	}

	private void spawnAtDefaultLocation() {
		this.getSpriteHandler().setX(Positions.STARTING_HERO_POSITION.getX());
		this.getSpriteHandler().setY(Positions.STARTING_HERO_POSITION.getY());
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
		if (Direction.SHIFT.containsKey(key)) {
			// limit to 2sec or smthing
			this.speed += Values.BOOST.getValue();
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
		if (Direction.SHIFT.containsKey(key)) {
			this.speed -= Values.BOOST.getValue();
		}
	}

	public SpriteHandler getSpriteHandler() {
		return spriteHandler;
	}

	public void setSpriteHandler(SpriteHandler spriteHandler) {
		this.spriteHandler = spriteHandler;
	}
}
