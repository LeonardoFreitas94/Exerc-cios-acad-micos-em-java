package lista6;

public class contaPoupanša {
	private float saldo;
	private String titular;
	private String numero;
	private float taxaDeRendimento;
	
	public contaPoupanša(float S, String T, String N,float t) {
		saldo = S;
		titular = T;
		numero = N;
		taxaDeRendimento = t;
		
	}
	public String toString() {
		return "Conta Poupanša: "+this.numero+" Saldo Atual: "+this.saldo;
		
	}

}
