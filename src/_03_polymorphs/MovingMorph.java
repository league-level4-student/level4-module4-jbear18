package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
Random rand= new Random();
Random randd= new Random();
	MovingMorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		int num= rand.nextInt(400);
		int numm= randd.nextInt(400);
		g.fillRect(num, numm, getWidth(), getHeight());
	}

}
