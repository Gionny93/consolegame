package characters.commoncharacter.hero.movement;

import constants.Direction;

public class DefaultHeroMovement implements CharacterMovement {

	@Override
	public void move(Direction direction) {
		switch (direction) {
		case UP:
			System.out.println("Moved up 1 tile");
			break;
		default:
			break;
		}
	}

}
