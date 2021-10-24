package Spellogica;

import java.awt.Color;

public class Bezetting {

	private Color color;
	private Waar waar1,waar2;
	private int prijs;
	
	public Bezetting(Waar waar1, Waar waar2, Color color,int prijs) {
		this.waar1=waar1;
		this.waar2=waar2;
		this.color=color;
		this.prijs=prijs;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Waar getWaar1() {
		return waar1;
	}
	
	public void setWaar1(Waar waar) {
		this.waar1 = waar;
	}

	public Waar getWaar2() {
		return waar2;
	}

	public void setWaar2(Waar waar2) {
		this.waar2 = waar2;
	}

	public int getPrijs() {
		return prijs;
	}
}
