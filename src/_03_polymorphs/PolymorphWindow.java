package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

//	Polymorph bluePoly;
//	Polymorph redPoly;
//	Polymorph movingMorph;

	Polymorph poly1;
	Polymorph poly2;
	Polymorph poly3;
	Polymorph poly4;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

//		bluePoly = new BluePolymorph(0, 0);
//		redPoly = new RedPolymorph(50, 50);
//		movingMorph = new MovingMorph(100, 100);
		poly1 = new CircleMorph(250, 250);
		poly2 = new Mouse(0, 0);
		poly3 = new DisplayImg(0, 400);
		poly4 = new PrintJOp(400, 400);

//		polymorphs.add(bluePoly);
//		polymorphs.add(redPoly);
//		polymorphs.add(movingMorph);
		polymorphs.add(poly1);
		polymorphs.add(poly2);
		polymorphs.add(poly3);
		polymorphs.add(poly4);

		window.addMouseListener(this);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		for (Polymorph polymorph : polymorphs) {
			polymorph.draw(g);
		}

		// draw polymorph

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : polymorphs) {
			polymorph.update();
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() > 400 && e.getY() > 400) {
			JOptionPane.showMessageDialog(null, "clickity clackity");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		poly2.setX(e.getX());
		poly2.setY(e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
