package Spellogica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TerugListener implements ActionListener {

	JFrame f;
	JPanel jpaneelin;
	JPanel jpaneeluit;
	
	public TerugListener(JFrame f, JPanel jpaneelin, JPanel jpaneeluit) {
		this.f=f;
		this.jpaneelin=jpaneelin;
		this.jpaneeluit=jpaneeluit;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		f.remove(jpaneeluit);
		f.add(jpaneelin);
		f.repaint();


	}

}
