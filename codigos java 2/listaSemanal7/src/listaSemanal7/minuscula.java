package listaSemanal7;

public class minuscula extends formatacaoTexto {
	
	public minuscula(String N) {
		nome = N.toLowerCase();
	}
	
	String formatarTexto(){
		return nome;
	}

}
