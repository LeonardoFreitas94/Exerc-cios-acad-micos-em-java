
public abstract  class Personagem {
	protected String nome;
	protected int nivel;
	
	public Personagem(String nome) {
		nivel = 1;
		
	}
	
	public String toString() {
		return nome+" "+nivel;
	}

}
