import javax.swing.JOptionPane;

public class ExibirBandeira {
	
	public ExibirBandeira() {
		String[] lista = {"França", "Alemanha", "Camarões", "Holanda"};
		String E = (String)JOptionPane.showInputDialog(null, "Escolha um País", "Exibir Bandeiras", JOptionPane.INFORMATION_MESSAGE, null, lista, lista[0]);
		if(E==null) {
			E = "null";
		}
		switch(E) {
			case "França":
				new França();
				break;
			case "Alemanha":
				new Alemanha();
				break;
			case "Camarões":
				new Camaroes();
				break;
			case "Holanda":
				new Holanda();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nenhum resultado será exibido", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
	}
	
	
	}
		
		
		
}
	



