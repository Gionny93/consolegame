package constants;

public enum Dimensions {

	WORLD_DEFAULT(6, 20), DEFAULTS_TILE(1,1);

	private int x, y;

	private Dimensions(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
