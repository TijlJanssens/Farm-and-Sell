package Spellogica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class SellListener implements ActionListener {

	private JFrame f;
	private FarmPanel fp;
	private Speler speler;
	
	public SellListener(JFrame f,FarmPanel fp, Speler speler) {
		this.f=f;
		this.fp=fp;
		this.speler=speler;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		f.remove(fp);
		f.add(new SellPanel(speler));
		f.repaint();
		
	}
}   

	

