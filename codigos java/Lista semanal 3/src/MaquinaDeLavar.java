
public class MaquinaDeLavar {
	
	public int lavar(Roupa[] R) {
		
		for (int i = 0; i<R.length; i++) {
			if(R[0].getcor() != R[i].getcor()) {
				return -1;}
		}
	
		int tempo = 0;
		for (int r = 0; r<R.length; r++) {
			
			if (R[r].getcor() == Cor.BRANCO) {
				tempo += 1;
			}
			else {
				tempo += 2;
			}
			if(R[r].getestado() == Estado.SUJA) {
				tempo += 3;
			}
			if(R[r].gettamanho() == Tamanho.G) {
				tempo += 8;
			}
			else if(R[r].gettamanho() == Tamanho.M) {
				tempo += 5;
			}
			else {
				tempo += 3;
			}
		}
		for(int m = 0; m<R.length; m++) {
			R[m].setestado(Estado.LIMPA);
		}
		return tempo;
		
	}

}
