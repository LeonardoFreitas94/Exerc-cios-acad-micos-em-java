package lista6;

public class contaCorrente {
	private float saldo;
	private String titular;
	private String numero;
	private float chequeEspecial;
	
	public contaCorrente(float S,String T,String N, float C){
		saldo = S;
		titular = T;
		numero = N;
		chequeEspecial = C;
		
	}
	public String toString() {
		return "Conta Corrente: "+this.numero+" Saldo Atual: "+this.saldo;
		
	}

}
