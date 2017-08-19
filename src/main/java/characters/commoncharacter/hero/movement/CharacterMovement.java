package characters.commoncharacter.hero.movement;

import java.awt.event.KeyEvent;

public interface CharacterMovement {

	void move();
	
	void keyPressed(KeyEvent e);
	
	void keyReleased(KeyEvent e);
	
}
