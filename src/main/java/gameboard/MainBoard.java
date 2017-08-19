package gameboard;

import javax.swing.JFrame;

import constants.Dimensions;
import game.Game;

public class MainBoard extends JFrame {

	private static final long serialVersionUID = 3721878619173316091L;

	public MainBoard(Game gameWrapper) {
		initUI(gameWrapper);
	}

	private void initUI(Game gameWrapper) {
		add(new StartPlayingBoard(gameWrapper));
		// read settings from conf file or smthing loadWindowConfig();
		setSize(Dimensions.WINDOW_DIM.getX(), Dimensions.WINDOW_DIM.getY());
		setResizable(false);

		setTitle("Shitty game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
