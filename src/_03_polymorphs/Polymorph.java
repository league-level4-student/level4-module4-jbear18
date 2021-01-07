package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width = 100;
	private int height = 100;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int xVal) {
		this.x = xVal;
	}

	public void setY(int yVal) {
		this.y = yVal;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
