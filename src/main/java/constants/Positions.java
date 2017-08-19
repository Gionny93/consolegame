package constants;

public enum Positions {
	STARTING_HERO_POSITION(InnerPosition.MID_LOW);

	private int x;

	private int y;

	private Positions(InnerPosition innerPosition) {
		switch (innerPosition) {
		case MID_LOW:
			this.setX(250);
			this.setY(250);
			break;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private enum InnerPosition {
		MID_LOW
	}
}
