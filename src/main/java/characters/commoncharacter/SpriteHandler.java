package characters.commoncharacter;

import java.awt.Image;

import javax.swing.ImageIcon;

import constants.Positions;

public class SpriteHandler {

	private Image image;

	private int x;

	private int dx;

	private int y;

	private int dy;

	public SpriteHandler(ImageIcon imageIcon, int xPosition, int yPosition) {
		image = imageIcon.getImage();
		setX(xPosition);
		setY(yPosition);
	}

	public SpriteHandler(ImageIcon imageIcon, Positions position) {
		this(imageIcon, position.getX(), position.getY());
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

}
