import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public abstract class Pa�s extends JFrame {
	protected JLabel icone;
	
	
	public Pa�s() {
		Label();
		setSize(320, 240);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		
		
	}
	
	abstract void Label();

}
