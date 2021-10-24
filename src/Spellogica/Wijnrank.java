package Spellogica;

import java.awt.Color;

public class Wijnrank extends Bezetting {

	
	public Wijnrank() {
		super(new Rozijn(), new Wijn(),new Color(102, 0,153), 300);

	}

	public Rozijn getRozijn() {
		return (Rozijn) this.getWaar1();
	}


	public Wijn getWijn() {
		return (Wijn) this.getWaar2();
	}

	
}
