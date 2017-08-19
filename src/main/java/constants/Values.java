package constants;

public enum Values {
	BURNING_GROUND(2), BURNING_SLOW_RATE(0), BOOST(3);

	private int value;

	private Values(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
