package lista6;

public class contaPoupança {
	private float saldo;
	private String titular;
	private String numero;
	private float taxaDeRendimento;
	
	public contaPoupança(float S, String T, String N,float t) {
		saldo = S;
		titular = T;
		numero = N;
		taxaDeRendimento = t;
		
	}
	public String toString() {
		return "Conta Poupança: "+this.numero+" Saldo Atual: "+this.saldo;
		
	}

}
