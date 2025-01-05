
public abstract class Adicional extends Bebida {
	protected Bebida bebida;

	public Adicional(Bebida B) {
		this.bebida = B;
	}

	
	public String getNome() {
		return super.getNome()+" "+this.bebida;
	}

	
	public double getPre�o() {
		this.bebida.pre�o += super.getPre�o();
		return this.bebida.getPre�o();
	}

	
	public float getTeorAlcoolico() {
		this.bebida.teorAlcoolico += super.getPre�o();
		return super.getTeorAlcoolico()+this.bebida.getTeorAlcoolico();
	}
}
