package listaSemanal7;

public class multiplica�ao extends opera�aoMatematica {
	
	public multiplica�ao(int v1, int v2) {
		valor1 = v1;
		valor2 = v2;
	}
	
	public int fazerConta() {
		int mult = valor1 * valor2;
		return mult;
	}


}
