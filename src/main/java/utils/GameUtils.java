package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import characters.commoncharacter.CharacterAttributes;
import characters.commoncharacter.CharactersFactory;
import characters.commoncharacter.hero.Hero;
import constants.CharacterClass;
import constants.FileNames;
import game.GameSaveStructure;

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

	public static void saveCharacterToFile(Hero createCharacter) {

		GameSaveStructure gameSaveStructure = new GameSaveStructure();

		gameSaveStructure.setCharacter(createCharacter);

		// create dir
		if (!saveDir.toFile().exists()) {
			createDir(saveDir.toFile());
		}

		// create file at dir
		saveToFile(saveDir, gameSaveStructure);
	}

	public static boolean lookForSaveFiles() {
		File dir = saveDir.toFile();
		if (!dir.exists())
			return false;
		File[] matches = getSaveFiles(dir);
		return (matches.length == 0) ? false : true;
	}

	public static GameSaveStructure loadGame() {
		System.out.println("\nLoading file...\n");
		GameSaveStructure save = new GameSaveStructure();

		// TODO make it dynamic from load file screen
		File file = getSaveFiles(saveDir.toFile())[0];

		try {
			if (file.exists()) {
				// read file, (first line is character, every field is divide by pipe |)
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = in.readLine()) != null) {
					line = CryptUtils.decrypt(line);
					String[] characterData = line.split("\\|"); // stores into an array every field of the object
																// separated by |
					System.out.println(line);
					CharacterClass cl = CharacterClass.valueOf(characterData[0]);
					String name = characterData[1];
					CharacterAttributes characterAttributes = new CharacterAttributes();
					characterAttributes.setVitality(Integer.parseInt(characterData[2]));
					characterAttributes.setIntelligence(Integer.parseInt(characterData[3]));
					characterAttributes.setStrength(Integer.parseInt(characterData[4]));
					characterAttributes.setSpeed(Integer.parseInt(characterData[5]));
					save.setCharacter(CharactersFactory.createHero(name, cl));
					save.getCharacter().setAttributes(characterAttributes); // update default attributes with savefile
				}
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Character loaded -> " + save.getCharacter().getName());
		return save;
	}

	private static void saveToFile(Path path, GameSaveStructure gameSaveStructure) {
		try {
			String fileName = FileNames.SAVE_FILE.getFileName() + "-" + System.currentTimeMillis();
			File file = new File(path.toString() + File.separator + fileName);
			if (!file.exists()) {
				PrintWriter pw = new PrintWriter(file.toString(), "UTF-8");
				pw.println(CryptUtils.encrypt(gameSaveStructure.toString()));
				pw.close();
			} else {
				// TODO update character information
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createDir(File dir) {

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

	private static File[] getSaveFiles(File dir) {
		File[] matches = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith(FileNames.SAVE_FILE.getFileName());
			}
		});
		return matches;
	}
}
