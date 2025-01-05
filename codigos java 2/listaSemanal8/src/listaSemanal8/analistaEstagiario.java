package listaSemanal8;

public class analistaEstagiario extends analistas {
	
	
	public float salarioFinal() {
		this.salario = 1000;
		float S = 0;
		S += this.salario + (this.salario*this.nivel*0.1);
		return S;
	}

}
