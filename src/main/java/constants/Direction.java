package constants;

import java.awt.event.KeyEvent;

// TODO probably better to make a config file
public enum Direction {
	UP(KeyEvent.VK_UP, KeyEvent.VK_W), LEFT(KeyEvent.VK_LEFT, KeyEvent.VK_A), DOWN(KeyEvent.VK_DOWN,
			KeyEvent.VK_S), RIGHT(KeyEvent.VK_RIGHT, KeyEvent.VK_D), SHIFT(KeyEvent.VK_SHIFT);

	private int[] key;

	private Direction(int... possibleMovements) {
		this.key = possibleMovements;
	}

	public void setKey(int[] key) {
		this.key = key;
	}

	public int[] getKey() {
		return this.key;
	}

	public boolean containsKey(int movKey) {
		for (Integer key : getKey()) {
			if (key == movKey) {
				return true;
			}
		}
		return false;
	}

}
