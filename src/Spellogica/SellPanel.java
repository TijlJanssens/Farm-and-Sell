package Spellogica;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class SellPanel extends JPanel {

	private final String[] bestemmingsslijst= new String [] {"Frankrijk", "Turkije","China","Verenigde Staten","Australië"};
	private final String[] verkoopsslijst= new String [] {"Wol", "Schapenkaas","Wijn","Rozijn"};
	
	private JTextField hoeveelheid;
	
	private Speler speler;
	
	
	
	
	public SellPanel(Speler speler) {
		this.speler=speler;
	}

	
	
	
	
}
