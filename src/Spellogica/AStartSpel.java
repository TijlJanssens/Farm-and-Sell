package Spellogica;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;



public class AStartSpel {

	public static JFrame f=new JFrame();
	private static Speler speler = new Speler();
	private static FarmPanel farmpaneel = new FarmPanel(speler,f);

	
	public static void main(String[] args) {
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(00, 00); //standaard in de hoek van het scherm
		f.setSize(1000, 730);
		f.setResizable(false);
		f.setTitle("Farm and Sell");
		f.add(farmpaneel);
		f.setVisible(true);
	} 
}


