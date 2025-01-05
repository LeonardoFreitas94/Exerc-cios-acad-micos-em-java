import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Alemanha extends País{
	

	
	public void Label() {
		icone = new JLabel();
		icone.setBounds(30, 130, 250, 55);
		icone.setOpaque(true);
		icone.setBackground(Color.YELLOW);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Bandeira da Alemanha");
		add(icone);
		icone = new JLabel();
		icone.setBounds(30, 20, 250, 55);
		icone.setOpaque(true);
		icone.setBackground(Color.BLACK);
		add(icone);
		icone = new JLabel();
		icone.setBounds(30, 75, 250, 55);
		icone.setOpaque(true);
		icone.setBackground(Color.RED);
		add(icone);
		
	}
	
	

}
