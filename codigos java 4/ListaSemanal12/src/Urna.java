import javax.swing.JOptionPane;

public class Urna {

	public static void main(String[] args) {
		String Q = JOptionPane.showInputDialog(null, "Eleições", "Informe a Quantidade de eleitores", JOptionPane.INFORMATION_MESSAGE);
		new InformaçõesDoEleitor();
		new Votar();
		
	}

}
