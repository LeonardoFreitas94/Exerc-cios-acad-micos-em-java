
public class Quadrilatero {
	private int largura;
	private int altura;
	
	public Quadrilatero(int L,int A) {
		largura = L;
		altura = A;
	}
	public Quadrilatero(int Q) {
		largura = Q;
		altura = Q;		
	}
	public boolean isQuadrado() {
		int l = largura;
		int a = altura;
		if(l == a) {
			return true;
		}
		return false;
	}
	public int area() {
		return largura * altura;
	}
	public int getLargura() {
		return largura;
	}
	public int getAltura() {
		return altura;
	}
	
	public boolean equals(Quadrilatero quad) {
		if (largura == quad.getLargura() && altura == quad.getAltura()) {
			return true;
		}
		else if (largura == quad.getAltura() && altura == quad.getLargura()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		
		String[][] desenho = new String[altura][largura];
		
		String codArt = "\n";
		
		for (int i = 0; i < desenho.length; i++) {
			for (int j = 0; j < desenho[i].length; j++) {
				
				codArt += "O";
			}
			
			codArt += "\n";
		}
		
		System.out.println(codArt);
		return codArt;
	}
}	