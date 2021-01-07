package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class DisplayImg extends Polymorph {
BufferedImage img;
	DisplayImg(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			img=ImageIO.read(this.getClass().getResourceAsStream("sickemojivirus.jpg"));
		}catch(Exception e) {
			
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
g.setColor(Color.MAGENTA);
g.drawImage(img, getX(), getY(), getWidth(), getHeight(), null);
	}

}
