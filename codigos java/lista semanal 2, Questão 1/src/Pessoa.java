
public class Pessoa {
	private String Nome;
	private String Sexo;
	private float Peso;
	private float Altura;
	private int Idade;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String N) {
		Nome = N;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String S) {
		Sexo = S;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float P) {
		Peso = P;
	}
	public float getAltura() {
		return Altura;
	}
	public void setAltura(float A) {
		Altura = A;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int I) {
		if(I>=0)
			Idade = I;
	}
	public boolean eIgual(Pessoa PE) {
		if(Nome.equals(PE.getNome()) && Idade == PE.getIdade()){
			return true;
		}
		else {
			return false;
		}
	}
		
	

}
