package Spellogica;

import java.awt.Color;
import java.awt.Graphics;

public class Grond {

	private int x,y;
	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	private Bezetting bezetting;
	private final int breedte = 70;
	
	public Bezetting getBezetting() {
		return bezetting;
	}
	
	public void setBezetting(Bezetting bezetting) {
		this.bezetting = bezetting;
	}
	
	public void Drawme(Graphics g) {
		g.setColor(this.bezetting.getColor());
		g.fillRect(x, y, breedte, breedte);
		g.setColor(Color.black);
		g.drawRect(x, y, breedte, breedte);
	}
	
	public Grond(int x, int y, Bezetting bezetting) {
		this.x=x;
		this.y=y;
		this.bezetting = bezetting;
	}
}
