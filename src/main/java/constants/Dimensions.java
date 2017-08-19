package constants;

public enum Dimensions {

	YULIA_CITY(80, 25), WINDOW_DIM(600, 400);

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
