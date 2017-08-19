package characters.commoncharacter.hero.movement;

import characters.commoncharacter.SpriteHandler;

public class CollisionDetection {

	public static boolean characterWithinGameWindow(int windowX, int windowY, SpriteHandler spriteHandler) {
		int imageWidth = spriteHandler.getImage().getWidth(null);
		int imageHeight = spriteHandler.getImage().getHeight(null);
		int windowMinX = 0;
		int windowMinY = 0;
		int windowMaxX = windowX - imageWidth;
		int windowMaxY = windowY - imageHeight;
		int currentX = spriteHandler.getX() + spriteHandler.getDx();
		int currentY = spriteHandler.getY() + spriteHandler.getDy();

		if (currentX < windowMinX || currentY < windowMinY) {
			return false;
		}

		// maxX maxY checks bugs out idk homie
		return true;
	}
}
