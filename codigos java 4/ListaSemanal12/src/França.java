import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fran�a extends Pa�s{
	
	public void Label() {
		icone = new JLabel();
		icone.setBounds(30, 20, 85, 170);
		icone.setOpaque(true);
		icone.setBackground(Color.BLUE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Bandeira da Fran�a");
		add(icone);
		icone = new JLabel();
		icone.setBounds(200, 20, 85, 170);
		icone.setOpaque(true);
		icone.setBackground(Color.RED);
		add(icone);
		
	}

}
