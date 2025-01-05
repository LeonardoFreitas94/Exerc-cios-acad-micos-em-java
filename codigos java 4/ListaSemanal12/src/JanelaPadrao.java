import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public abstract class JanelaPadrao extends JFrame{
	JButton botao;
	JLabel titulo;
	public JanelaPadrao() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setTitle("Votação");
		setVisible(true);
	}
	public JButton getBotao() {
		return botao;
	}
	public JLabel getTitulo() {
		return titulo;
	}
}
