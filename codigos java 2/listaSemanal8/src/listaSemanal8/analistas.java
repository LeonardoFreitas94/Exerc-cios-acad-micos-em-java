package listaSemanal8;

public abstract class analistas {
	protected String nome;
	protected float salario = 2000;
	protected int nivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String N) {
		nome = N;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float S) {
		salario += S;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int N) {
		nivel = N;
	}
	public abstract float salarioFinal();

}
