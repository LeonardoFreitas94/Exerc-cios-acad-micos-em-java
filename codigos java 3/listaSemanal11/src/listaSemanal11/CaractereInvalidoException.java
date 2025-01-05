package listaSemanal11;

import javax.swing.JOptionPane;

public class CaractereInvalidoException extends Exception {
	public void message() {
		JOptionPane.showMessageDialog(null, "O nome possui caracteres invalidos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}

}
