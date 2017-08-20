package gameboard;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import characters.commoncharacter.GameInputsHandler;
import game.Game;
import states.StartGame;

public class StartPlayingBoard extends JPanel implements ActionListener {

	private static final long serialVersionUID = -1385414945774699299L;

	private Timer timer;

	private Game gameWrapper;

	private final int DELAY = 10;

	public StartPlayingBoard(Game gameWrapper) {
		this.setGameWrapper(gameWrapper);
		this.gameWrapper.setOldState(new StartGame());
		initBoard();
	}

	private void initBoard() {

		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);

		timer = new Timer(DELAY, this);
		timer.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrwaing(g);

		Toolkit.getDefaultToolkit().sync();
	}

	private void doDrwaing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(gameWrapper.getCharacter().getSprite().getImage(), gameWrapper.getCharacter().getSprite().getX(),
				gameWrapper.getCharacter().getSprite().getY(), this);
		// TODO draw enemies
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gameWrapper.getCharacter().getCharacterMovement().move();
		repaint();
	}

	public Game getGameWrapper() {
		return gameWrapper;
	}

	public void setGameWrapper(Game gameWrapper) {
		this.gameWrapper = gameWrapper;
	}

	private class TAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			GameInputsHandler.handleGameInputsKeyPressed(gameWrapper, e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			GameInputsHandler.handleGameInputsKeyReleased(gameWrapper, e);
		}
	}

}
