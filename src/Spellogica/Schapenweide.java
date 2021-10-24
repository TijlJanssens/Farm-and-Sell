package Spellogica;

import java.awt.Color;

public class Schapenweide extends Bezetting {

	
	
	public Schapenweide() {
		super(new Wol(),new Schapenkaas(), Color.WHITE, 150);
		
	}

	public Wol getWol() {
		return (Wol) this.getWaar1();
	}

	public Schapenkaas getSchapenkaas() {
		return (Schapenkaas) this.getWaar2();
	}


}
