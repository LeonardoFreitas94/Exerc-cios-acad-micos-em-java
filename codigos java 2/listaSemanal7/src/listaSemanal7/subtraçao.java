package listaSemanal7;

public class subtrašao extends operašaoMatematica {
	
	public subtrašao(int v1, int v2) {
		valor1 = v1;
		valor2 = v2;
	}
	
	public int fazerConta() {
		int sub = valor1 - valor2;
		return sub;
	}

}
