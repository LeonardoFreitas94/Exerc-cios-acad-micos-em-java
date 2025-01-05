package listaSemanal7;

public abstract class treinoDiario {
	
	final void treinoD() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
	}
	abstract void preparoFisico(); 
	
	abstract void jogoTreino(); 
	
	final void treinoTatico() {
		System.out.println("Treino tático normal");
	}
	
	
}
