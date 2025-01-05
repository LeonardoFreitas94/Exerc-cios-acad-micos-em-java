package listaSemanal8;

public abstract class pokemon {
	protected String nome;
	protected String tipo;
	protected int nivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String N) {
		nome = N;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String T) {
		tipo = T;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int N) {
		nivel = N;
	}
	
	abstract String ataqueA();
	abstract String ataqueB();
	abstract String ataqueC();
	abstract String ataqueD();
	abstract String ataqueE();

}
