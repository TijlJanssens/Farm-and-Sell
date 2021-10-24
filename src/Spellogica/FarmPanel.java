package Spellogica;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FarmPanel extends JPanel implements MouseListener{

	JButton sell;
	JButton spelVerlaten;
	
	Speler speler;
	
	private ArrayList<Grond> alleGronden;
	
	private Oerwoud oerwoud= new Oerwoud();
	
	Timer timer = new Timer();
	
	public static JFrame f;
	
	
	
	public FarmPanel(Speler speler, JFrame f) {
		this.setOpaque(false); // nodig of string schrijft over zichzelf!
		this.speler=speler;
		this.f=f;
		alleGronden=new ArrayList<Grond>();
		for (int rij=0; rij<10; rij++) {  									
			for (int kolom=0;kolom<10;kolom++) {
				alleGronden.add(new Grond(70*rij,70*kolom, oerwoud));		//in het begin is alles oerwoud, dan kunnen spelers het kopen en verbouwen
			}
		}
		alleGronden.set(0, new Grond(alleGronden.get(0).getX(),alleGronden.get(0).getY(),speler.getWijnrank()));
		alleGronden.set(1, new Grond(alleGronden.get(1).getX(),alleGronden.get(1).getY(),speler.getSchapenweide()));
		speler.addBezitteGronden(alleGronden.get(0));
		speler.addBezitteGronden(alleGronden.get(1));
		
		this.setLayout(null);
		
		
		sell = new JButton("Sell");
		spelVerlaten = new JButton("Spel verlaten");
		sell.addActionListener(new SellListener(this.f,this,this.speler));
		spelVerlaten.addActionListener(new QuitListener());
		sell.setBounds(785, 50, 150, 30);
		spelVerlaten.setBounds(785, 10, 150, 30);
		
		this.add(sell);
		this.add(spelVerlaten);
		
		timer.schedule(new Timertaak(this.speler,this),10000,10000);
		addMouseListener(this);
	
	}
	public ArrayList<Grond> getAlleGronden() {
		return alleGronden;
	}
	public void paintComponent(Graphics g) {
		for (Grond grond: alleGronden) {
			grond.Drawme(g);
		}
		Font myFont = new Font ("Courier New",1,17);
		g.setFont(myFont);
		g.drawString("Aantal kg rozijnen: "+ this.speler.getWijnrank().getRozijn().getHoeveelheid(), 725, 120);
		g.drawString("Aantal liters wijn: "+this.speler.getWijnrank().getWijn().getHoeveelheid(),725,150);
		g.drawString("Aantal kg wol: "+this.speler.getSchapenweide().getWol().getHoeveelheid(),725,180);
		g.drawString("Aantal kg geitenkaas: "+this.speler.getSchapenweide().getSchapenkaas().getHoeveelheid(),725,210);
		g.drawString("bank-account: €"+this.speler.getGeld(), 725, 270);
		repaint();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x_coord= e.getX();int y_coord = e.getY();
		int rijvolger=0;int kolomvolger=0;
		for (int rij=1;rij<11;rij++) {
			if (x_coord<=70*rij) {
				rijvolger=rij;break;
			}
		}
		for (int kolom=1;kolom<11;kolom++) {
			if (y_coord<=70*kolom) {
				kolomvolger=kolom;break;
			}
		}
		int index= 10*(rijvolger-1)+kolomvolger-1;
		//het gezochte veld is dan: alleGronden.get(index);	
		try {
			if(speler.getBezitteGronden().contains(alleGronden.get(index))) {
			}
			else {
				f.dispose();
				this.f.remove(this);
				this.f.add(new GrondKooppanel(speler,alleGronden.get(index),f,this));
				f.setVisible(true);
				
			}
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException lol){ // voor als je naast de velden klikt
			//niets doen in dat geval
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}
