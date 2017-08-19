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

import characters.commoncharacter.AbstractCharacter;
import game.Game;

public class StartPlayingBoard extends JPanel implements ActionListener {

	private static final long serialVersionUID = -1385414945774699299L;

	private Timer timer;

	private AbstractCharacter character;

	private final int DELAY = 10;

	public StartPlayingBoard(Game gameWrapper) {
		this.character = gameWrapper.getCharacter();
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
		g2d.drawImage(character.getSprite().getImage(), character.getSprite().getX(), character.getSprite().getY(),
				this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		character.getCharacterMovement().move();
		repaint();
	}

	public AbstractCharacter getCharacter() {
		return character;
	}

	public void setCharacter(AbstractCharacter character) {
		this.character = character;
	}

	private class TAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			character.getCharacterMovement().keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			character.getCharacterMovement().keyReleased(e);
		}
	}

}
