package constants;

public enum FileNames {
	SAVE_FILE("save"), SEPARATOR("|"), MAIN_DIR("ConsoleGame");

	private String fileName;

	private FileNames(String name) {
		this.fileName = name;
	}

	public String getFileName() {
		return this.fileName;
	}
}
