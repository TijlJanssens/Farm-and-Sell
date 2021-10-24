package Spellogica;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GrondKooppanel extends JPanel implements ActionListener{

	JComboBox bezettingen;
	
	private final String[] bezittingsslijst= new String [] {"Schapenweide", "Wijnrank"};
	
	JButton koop;

	JButton terug;
	Grond grond;
	Speler speler;
	public static JFrame f;
	FarmPanel farmpaneel;
	
	public GrondKooppanel(Speler speler, Grond grond, JFrame f, FarmPanel farmpaneel) {
		this.setLayout(null);
		
		this.speler= speler;
		this.grond= grond;
		this.f=f;
		this.farmpaneel=farmpaneel;
		
		bezettingen= new JComboBox<>(bezittingsslijst);
		bezettingen.addActionListener(this);
		
		koop=new JButton("Koop");
		terug=new JButton("Ga Terug");
		
		terug.addActionListener(new TerugListener(f, this.farmpaneel,this));
		koop.addActionListener(new koopListener(this.speler,this.grond,this));
		koop.addActionListener(new TerugListener(f, this.farmpaneel,this));
		
		koop.setBounds(400, 500, 200, 100);
		terug.setBounds(785, 10, 150, 30);
		bezettingen.setBounds(400, 400, 200, 50);
		
		JLabel background=new JLabel(new ImageIcon((new LoadImage("/varken.png")).getImage())); // werkt niet, waarom????
		this.add(background);
		background.setLayout(new FlowLayout());
		
		
		this.add(bezettingen);
		this.add(koop);
		this.add(terug);
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		for (int i=0;i<bezittingsslijst.length;i++) {
			if (this.bezettingen.getSelectedItem().equals(bezittingsslijst[i])) {
				g.drawString("Prijs: €" + 150*(1+i), 675, 425);
				break;
			}
		}
		Font myFont = new Font ("Courier New",1,35);
		g.setFont(myFont);
		g.drawString("Farm and Sell", 365, 200);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	     repaint();
	}
}
