import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Camaroes extends País{
	
	
	public void Label() {
		icone = new JLabel();
		icone.setBounds(30, 20, 85, 170);
		icone.setOpaque(true);
		icone.setBackground(new Color(1,100,50));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Bandeira de Camarões");
		add(icone);
		icone = new JLabel();
		icone.setBounds(200, 20, 85, 170);
		icone.setOpaque(true);
		icone.setBackground(new Color(50,100,250));
		add(icone);
		icone = new JLabel();
		icone.setBounds(115, 20, 85, 170);
		icone.setOpaque(true);
		icone.setBackground(Color.RED.darker());
		add(icone);
		
	}

}
