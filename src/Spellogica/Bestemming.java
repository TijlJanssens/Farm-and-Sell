package Spellogica;

public abstract class Bestemming {

	private int duur;

	public int getDuur() {
		return duur;
	}

	public Bestemming (int duur) {
		this.duur=duur;
	}
	
	public abstract String toString();
		
	
	
}
