import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class AlterarCor extends JFrame{
	String[] lista = {"BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", 
	"MANGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW"};
	private JComboBox<String> cores = new JComboBox<String>(lista);
	Color[] C = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, 
	Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, 
	Color.WHITE, Color.YELLOW};
	
	public class OuvinteJComboBox implements ActionListener{

		public void actionPerformed(ActionEvent E) {
			int opçao = getCores().getSelectedIndex();
			getContentPane().setBackground(C[opçao]);	
		}
	}

	public AlterarCor() {
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		cores.setBounds(100, 100, 200, 30);
		OuvinteJComboBox Ouvinte = new OuvinteJComboBox();
		cores.addActionListener(Ouvinte);
		add(cores);
		
	}
	
	public JComboBox<String> getCores() {
		return cores;
	}

	public static void main(String[] args) {
		new AlterarCor();

	}

}
