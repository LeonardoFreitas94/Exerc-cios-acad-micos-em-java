import javax.swing.JOptionPane;

public class ExibirBandeira {
	
	public ExibirBandeira() {
		String[] lista = {"Fran�a", "Alemanha", "Camar�es", "Holanda"};
		String E = (String)JOptionPane.showInputDialog(null, "Escolha um Pa�s", "Exibir Bandeiras", JOptionPane.INFORMATION_MESSAGE, null, lista, lista[0]);
		if(E==null) {
			E = "null";
		}
		switch(E) {
			case "Fran�a":
				new Fran�a();
				break;
			case "Alemanha":
				new Alemanha();
				break;
			case "Camar�es":
				new Camaroes();
				break;
			case "Holanda":
				new Holanda();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nenhum resultado ser� exibido", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
	}
	
	
	}
		
		
		
}
	



