package listaSemanal8;

public class som extends homeTheather{
	private int volume;
	private String V;
	private int N;
	
	public String getV() {
		return V;
	}
	
	public som(String Volume, int Num) {
		this.V = Volume;
		this.N = Num;
		
	}
		
		
		
		public void ligarModoFilme() {
			if(V.equals("aumentar")) {
				for(int i = 0; i<N;i++) {
					volume++;
				}
			}
			else if(V.equals("baixar")) {
				for(int i = 0; i<N;i++) {
					volume--;
				}
			}
			else {
				this.volume = 0;
			}
			
			
		}
		
	}

