package listaSemanal8;

public class analistaSenior extends analistas {
	private float acrescimo = 1800;
	
	public float salarioFinal() {
		float S = 0;
		S += this.salario + acrescimo + this.salario*this.nivel*0.1;
		return S;
	}

}
