package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Mouse extends Polymorph {

	Mouse(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
g.setColor(Color.YELLOW);
g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
