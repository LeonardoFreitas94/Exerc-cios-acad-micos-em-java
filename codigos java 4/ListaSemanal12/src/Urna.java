import javax.swing.JOptionPane;

public class Urna {

	public static void main(String[] args) {
		String Q = JOptionPane.showInputDialog(null, "Elei��es", "Informe a Quantidade de eleitores", JOptionPane.INFORMATION_MESSAGE);
		new Informa��esDoEleitor();
		new Votar();
		
	}

}
