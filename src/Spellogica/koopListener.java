package Spellogica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class koopListener implements ActionListener {

	Speler speler;
	Grond grond;
	GrondKooppanel grondkooppaneel;
	
	public koopListener(Speler speler, Grond grond, GrondKooppanel grondkooppaneel) {
		this.speler=speler;
		this.grond=grond;
		this.grondkooppaneel=grondkooppaneel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (grondkooppaneel.bezettingen.getSelectedItem().equals("Schapenweide")) {	
			if(speler.getGeld()>=speler.getSchapenweide().getPrijs()) {
				grond.setBezetting(speler.getSchapenweide());
				speler.removeGeld(speler.getSchapenweide().getPrijs());
				speler.addBezitteGronden(grond);
			}
			else {JOptionPane.showMessageDialog(grondkooppaneel, "Niet genoeg Mula om dit te kunnen kopen!", "Verdien meer", JOptionPane.ERROR_MESSAGE);}
		}
		else if (grondkooppaneel.bezettingen.getSelectedItem().equals("Wijnrank")&&speler.getGeld()>=speler.getWijnrank().getPrijs()) {
			if(speler.getGeld()>=speler.getWijnrank().getPrijs()) {
				grond.setBezetting(speler.getWijnrank());
				speler.removeGeld(speler.getWijnrank().getPrijs());
				speler.addBezitteGronden(grond);}
			else {JOptionPane.showMessageDialog(grondkooppaneel, "Niet genoeg Mula om dit te kunnen kopen!", "Verdien meer", JOptionPane.ERROR_MESSAGE);}
		}
	}

}
