package listaSemanal11;

import javax.swing.JOptionPane;

public class VetorIncorretoException extends Exception {
	
	public void Menssage1() {
		JOptionPane.showMessageDialog(null, "Só é permitido dois numeros, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	public void Menssage2() {
		JOptionPane.showMessageDialog(null, "Há caracteres invalidos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	

}
