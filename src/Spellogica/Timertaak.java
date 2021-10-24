package Spellogica;

import java.util.TimerTask;

public class Timertaak extends TimerTask{

	Speler speler;
	FarmPanel farmpaneel;
	
	public Timertaak(Speler speler, FarmPanel farmpaneel) {
		this.speler=speler;
		this.farmpaneel=farmpaneel;
		
	}
	
	@Override
	public void run() {
		for (Grond grond: speler.getBezitteGronden()) {
			if (grond.getBezetting()==speler.getWijnrank()) {
				this.speler.getWijnrank().getRozijn().verhoog(1);
				this.speler.getWijnrank().getWijn().verhoog(1);
			}
			else if (grond.getBezetting()==speler.getSchapenweide()) {
				this.speler.getSchapenweide().getWol().verhoog(1);
				this.speler.getSchapenweide().getSchapenkaas().verhoog(1);
			}
		}
		farmpaneel.repaint();
		
	}
	

}
