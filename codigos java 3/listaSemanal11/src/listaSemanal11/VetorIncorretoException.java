package listaSemanal11;

import javax.swing.JOptionPane;

public class VetorIncorretoException extends Exception {
	
	public void Menssage1() {
		JOptionPane.showMessageDialog(null, "S� � permitido dois numeros, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	
	public void Menssage2() {
		JOptionPane.showMessageDialog(null, "H� caracteres invalidos, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	}
	

}
