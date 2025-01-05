
public class CalculadoraDeIMC {
	
	public float CalcularIMC(Pessoa Pa){
		float Imc = (float)(Pa.getPeso()/(Pa.getAltura()*Pa.getAltura()));
		return Imc;
	}

}
