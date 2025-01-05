package lista6;

public class jogador {
	private String nome;
	private int quantidadeDePontos;
	
	public String getNome() {
		return nome;
	}
	public int getQuantidadeDePontos() {
		return quantidadeDePontos;
	}
	public jogador(String N) {
		nome = N;
		quantidadeDePontos = 0;
	}
	public void addPonto() {
		quantidadeDePontos++;
	}

}

