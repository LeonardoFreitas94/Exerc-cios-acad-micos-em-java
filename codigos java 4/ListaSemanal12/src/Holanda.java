import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Holanda extends País{
	
	public void Label() {
		icone = new JLabel();
		icone.setBounds(30, 130, 250, 55);
		icone.setOpaque(true);
		icone.setBackground(Color.BLUE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Bandeira da Holanda");
		add(icone);
		icone = new JLabel();
		icone.setBounds(30, 20, 250, 55);
		icone.setOpaque(true);
		icone.setBackground(Color.RED);
		add(icone);
		
	}

}
