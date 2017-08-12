package constants;

public enum DefaultStrings {
	DEFAULT_NAME("SAYIT");

	private String defaultname;

	private DefaultStrings(String defaultName) {
		this.defaultname = defaultName;
	}

	public String getDefaultName() {
		return this.defaultname;
	}
}
