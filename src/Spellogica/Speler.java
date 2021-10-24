package Spellogica;

import java.util.ArrayList;

public class Speler {

	private Schapenweide schapenweide;      			// HIER ALLE BEZETTINGEN SCHRIJVEN
	private Wijnrank wijnrank;
	private int geld;
	
	
	private ArrayList<Grond> bezitteGronden;
////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Speler() {
		bezitteGronden= new ArrayList<Grond>();
		this.schapenweide=new Schapenweide();    		// HIER OOK ALLES TOEVOEGEN
		this.wijnrank=new Wijnrank();
		this.geld=1000;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Schapenweide getSchapenweide() {				// van alles een getter maken!
		return schapenweide;
	}

	public Wijnrank getWijnrank() {
		return wijnrank;
	}
	public ArrayList<Grond> getBezitteGronden() {
		return bezitteGronden;
	}
	public void addBezitteGronden(Grond grond) {
		this.bezitteGronden.add(grond);
	}
	public int getGeld() {
		return geld;
	}
	public void addGeld(int geld) {
		this.geld += geld;
	}
	public void removeGeld(int geld) {
		this.geld -= geld;
	}
}
