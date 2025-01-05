
public abstract class Bebida {
	protected String nome;
	protected double preço;
	protected float teorAlcoolico;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public float getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(float teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	public Bebida() {
	}
	
	

}
