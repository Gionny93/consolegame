package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import characters.AbstractCharacter;
import constants.FileNames;

public class GameUtils {

	private static final Path saveDir = Paths.get(System.getProperty("user.home"), FileNames.MAIN_DIR.getFileName());

	public static String getInput() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static void saveCharacterToFile(AbstractCharacter createCharacter) {
		
		GameSaveStructure gameSaveStructure = new GameSaveStructure();
		
		gameSaveStructure.setCharacter(createCharacter);

		// create dir
		createDir(saveDir.toFile());
		
		// create file at dir
		createFile(saveDir, gameSaveStructure);
	}

	private static void createFile(Path path, GameSaveStructure gameSaveStructure) {
		try {
			String fileName = FileNames.SAVE_FILE.getFileName() + "-" + System.currentTimeMillis();
			File file = new File(path.toString() + File.separator + fileName);
			if (!file.exists()) {
				PrintWriter pw = new PrintWriter(file.toString(), "UTF-8");
				pw.println(gameSaveStructure.toString());
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createDir(File dir) {
		if (!dir.exists()) {
			System.out.println("Creating directory...");
			boolean result = false;

			try {
				dir.mkdir();
				result = true;
			} catch (SecurityException se) {

			}
			if (result) {
				System.out.println("Directory created at -> " + dir.toString());
			}
		}
	}

	public static boolean lookForSaveFiles() {
		File dir = saveDir.toFile();
		File[] matches = dir.listFiles(new FilenameFilter()
		{
		  public boolean accept(File dir, String name)
		  {
		     return name.startsWith("save");
		  }
		});
		return (matches.length == 0) ? false : true;
	}
	
	public static void loadGame() {
		// load game from the one picked up in list of saves (SavesList screen TODO)
		// get previously saved game, if it exists
		//GameSaveStructure gameSaveStructure = getGameSave();
	}

	/* TODO
	private static GameSaveStructure getGameSave() {
		GameSaveStructure save = new GameSaveStructure();

		File file = new File(path.toString() + File.separator + "save");

		try {
			if (file.exists()) {
				// read file, (first line is character, every field is divide by pipe |)
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = in.readLine()) != null) {
					String[] characterData = line.split("|");	// stores into an array every field of the object separated by |
					String name = characterData[0];				// name of the character is the first field of the first line
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return save;
	}
*/
}
