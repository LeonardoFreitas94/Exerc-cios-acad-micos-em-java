package listaSemanal11;

import javax.swing.JOptionPane;

public class Sauda�ao {
	private String E;
	private Paisess P;
	
	public Sauda�ao(String escolha) {
		if(escolha==null) {
			this.E = "null";
		}
		else {
			this.E = escolha;
		}
	}
	
	public void Saudar() {
		switch(E) {
			case "Brasil":
				P = new Brasil();
				P.OlaMundo();
				break;
			case "EUA":
				P = new EUA();
				P.OlaMundo();
				break;
			case "Espanha":
				P = new Espanha();
				P.OlaMundo();
				break;
			case "It�lia":
				P = new It�lia();
				P.OlaMundo();
				break;
			case "Fran�a":
				P = new Fran�a();
				P.OlaMundo();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nenhum resultado ser� exibido", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
	}
		
		
		
}
	
}


