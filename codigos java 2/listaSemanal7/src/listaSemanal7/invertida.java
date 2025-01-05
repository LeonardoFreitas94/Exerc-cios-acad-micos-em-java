package listaSemanal7;

public class invertida extends formatacaoTexto {
	
	public invertida(String N) {
		nome = N;
		
	}
	String formatarTexto() {
		StringBuffer in = new StringBuffer(this.nome);
		in.reverse();
		return in.toString();
	}

}
