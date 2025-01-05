package listaSemanal11;

import javax.swing.JOptionPane;

public class SenhaIncorretaException extends Exception {
	
	public void Menssage1() {
		JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}

}
