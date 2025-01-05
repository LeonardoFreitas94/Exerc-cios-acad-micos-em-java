package listaSemanal8;

public abstract class exercito {
	protected int dinheiro = 1200;
	protected int catapultas;
	protected int cavalaria;
	protected int infantaria;
	protected int artilharia;
	protected int[] unidades= new int[4];
	
	public void setCatapultas(int C) {
		catapultas = C;
	}
	public int getCatapultas() {
		return catapultas;
	}
	public void setCavalaria(int C) {
		cavalaria = C;
	}
	public int getCavalaria() {
		return cavalaria;
	}
	public void setInfantaria(int I) {
		infantaria = I;
	}
	public int getInfantaria() {
		return infantaria;
	}
	public void setArtilharia(int I) {
		artilharia = I;
	}
	public int getArtilharia() {
		return artilharia;
	}
	public int getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(int D) {
		dinheiro = D;
	}
	public int[] getUnidades() {
		return unidades;
	}
	
	public void compraCatas(int Quant) {
		int total = Quant*100;
		if(total>getDinheiro()) {
			catapultas += dinheiro/100;
			setDinheiro(0);
		}
		else {
			catapultas += Quant;
			setDinheiro(getDinheiro() - total);
		}
	}
	public void compraInfa(int Quant) {
		int total = Quant*100;
		if(total>getDinheiro()) {
			infantaria += dinheiro/100;
			setDinheiro(0);
		}
		else {
			infantaria+=Quant;
			setDinheiro(getDinheiro() - total);
		}
	}
	public void compraCava(int Quant) {
		int total = Quant*100;
		if(total>getDinheiro()) {
			cavalaria += dinheiro/100;
			setDinheiro(0);
		}
		else {
			cavalaria+=Quant;
			setDinheiro(getDinheiro() - total);
		}
	}
	public void compraArti(int Quant) {
		int total = Quant*300;
		if(total>getDinheiro()) {
			artilharia += dinheiro/300;
			setDinheiro(0);
		}
		else {
			artilharia+=Quant;
			setDinheiro(getDinheiro() - total);
		}
	}
		
	abstract void lista();
	
	
	
	
	

}
