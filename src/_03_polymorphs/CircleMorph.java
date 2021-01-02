package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
int counter=0;
	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
g.setColor(Color.GREEN);
setX((int)(getX()+Math.cos(counter)*50));
setY((int)(getX()+Math.sin(counter)*50));
counter++;
g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
