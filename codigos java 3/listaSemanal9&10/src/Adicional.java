
public abstract class Adicional extends Bebida {
	protected Bebida bebida;

	public Adicional(Bebida B) {
		this.bebida = B;
	}

	
	public String getNome() {
		return super.getNome()+" "+this.bebida;
	}

	
	public double getPreço() {
		this.bebida.preço += super.getPreço();
		return this.bebida.getPreço();
	}

	
	public float getTeorAlcoolico() {
		this.bebida.teorAlcoolico += super.getPreço();
		return super.getTeorAlcoolico()+this.bebida.getTeorAlcoolico();
	}
}
