package lista6;

public class contaPoupan�a {
	private float saldo;
	private String titular;
	private String numero;
	private float taxaDeRendimento;
	
	public contaPoupan�a(float S, String T, String N,float t) {
		saldo = S;
		titular = T;
		numero = N;
		taxaDeRendimento = t;
		
	}
	public String toString() {
		return "Conta Poupan�a: "+this.numero+" Saldo Atual: "+this.saldo;
		
	}

}
