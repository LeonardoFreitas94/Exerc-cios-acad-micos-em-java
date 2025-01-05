package listaSemanal8;

public class TV extends homeTheather {
	private boolean ligada;
	
	public boolean getLigada() {
		return ligada;
	}
	
	public TV(String tv) {
		if(tv.equals("ligar")) {
			ligada = true;
		}
		else if(tv.equals("desligar")) {
			ligada = false;
		}
		else {
			System.out.print("Erro");
		}
		
		
	}
	
	public void ligarModoFilme() {
		if(ligada==true) {
			System.out.println("Ligada");
		}
		else {
			System.out.println("Desligada");
			
		}
	}
	
	
	

}
