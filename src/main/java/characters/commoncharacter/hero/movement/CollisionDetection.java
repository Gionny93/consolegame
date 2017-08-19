package characters.commoncharacter.hero.movement;

import characters.commoncharacter.SpriteHandler;

public class CollisionDetection {

	public static boolean characterWithinGameWindow(int windowX, int windowY, SpriteHandler spriteHandler) {
		int imageWidth = spriteHandler.getImage().getWidth(null);
		int imageHeight = spriteHandler.getImage().getHeight(null);
		int windowMinX = 0;
		int windowMinY = 0;
		int windowMaxX = windowX - imageWidth;
		// why the fuck -38 idk just works nice code lul
		int windowMaxY = windowY - imageHeight - 38;
		int currentX = spriteHandler.getX() + spriteHandler.getDx();
		int currentY = spriteHandler.getY() + spriteHandler.getDy();

		if (currentX <= windowMinX || currentY <= windowMinY || currentX >= windowMaxX || currentY >= windowMaxY) {
			return false;
		}

		// maxX maxY checks bugs out idk homie
		return true;
	}
}
