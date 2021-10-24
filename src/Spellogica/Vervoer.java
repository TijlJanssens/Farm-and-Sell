package Spellogica;

public abstract class Vervoer {

	private double mtp;//multiplier voor tijd
	private int capaciteit;
	
	
	public abstract String toString();


	public Vervoer(int cap, double d) {
		this.capaciteit=cap;
		this.mtp=d;
	}
	
	
	public int getCapaciteit() {
		return capaciteit;
	}

	public double getMtp() {
		return mtp;
	}


	
	
	
}
