package listaSemanal7;

public class adišao extends operašaoMatematica {
	
	public adišao(int v1, int v2) {
		valor1 = v1;
		valor2 = v2;
	}
	
	public int fazerConta() {
		int ad = valor1 + valor2;
		return ad;
	}

}
