package listaSemanal11;

import javax.swing.JOptionPane;

public class Saudaçao {
	private String E;
	private Paisess P;
	
	public Saudaçao(String escolha) {
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
			case "Itália":
				P = new Itália();
				P.OlaMundo();
				break;
			case "França":
				P = new França();
				P.OlaMundo();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nenhum resultado será exibido", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
	}
		
		
		
}
	
}


