package listaSemanal8;

public class luz extends homeTheather {
	private boolean acesa;
	private String liga;
	
	
	public boolean getAcesa() {
		return acesa;
	}
	
	public luz(String L) {
		liga = L;
		
	}
	public void ligarModoFilme() {
		if(liga.equals("ligar")) {
			acesa = true;
		}
		else if(liga.equals("desliga")) {
			acesa = false;
		}
		else
			System.out.print("Erro");
		
	}

}
