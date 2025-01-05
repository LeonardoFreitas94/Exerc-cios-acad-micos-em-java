
public class Samurai extends Personagem{
	protected String clã;
	
	
	public Samurai(String nome, String C) {
		super(nome);
		
		clã = C;
		
	}
	
	public String toString() {
		return super.toString()+" "+clã;
	}

	
	
	
	
	

}
