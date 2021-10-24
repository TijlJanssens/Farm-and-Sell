package Spellogica;

public class Waar {

	private int hoeveelheid;
	
	public Waar() {
		this.hoeveelheid=0;
	}
	
	public void verhoog(int aantal) {
		this.setHoeveelheid(this.getHoeveelheid() + aantal);
	}
	public void verlaag(int aantal) {
		this.setHoeveelheid(this.getHoeveelheid() - aantal);
	}

	public int getHoeveelheid() {
		return hoeveelheid;
	}

	public void setHoeveelheid(int hoeveelheid) {
		this.hoeveelheid = hoeveelheid;
	}
}
