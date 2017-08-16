package characters.commoncharacter.hero.movement;

import constants.Direction;

public class TwoTilesUpHeroMovement implements CharacterMovement {

	@Override
	public void move(Direction direction) {
		switch (direction) {
		case UP:
			System.out.println("Moved up 2 tiles");
			break;
		default:
			break;
		}
	}

}
