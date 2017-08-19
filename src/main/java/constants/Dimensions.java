package constants;

public enum Dimensions {

	WORLD_DEFAULT(80, 25), WINDOW_DIM(800, 600);

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
