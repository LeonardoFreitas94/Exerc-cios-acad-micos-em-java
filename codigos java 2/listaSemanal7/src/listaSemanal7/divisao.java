package listaSemanal7;

public class divisao extends opera�aoMatematica {
	
	public divisao(int v1, int v2) {
		valor1 = v1;
		valor2 = v2;
	}
	
	public int fazerConta() {
		int div = valor1 / valor2;
		return div;
	}

}
