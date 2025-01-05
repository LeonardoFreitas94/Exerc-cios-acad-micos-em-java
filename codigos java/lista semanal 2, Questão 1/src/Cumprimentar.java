import java.util.Scanner;

public class Cumprimentar {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Pessoa pe = new Pessoa();
		System.out.print("Digite seu nome ");
		pe.setNome(leitor.nextLine());
		System.out.print("Digite seu sexo ");
		pe.setSexo(leitor.nextLine());
		System.out.print("Digite sua idade ");
		pe.setIdade(Integer.parseInt(leitor.nextLine()));
		Porteiro porteiro = new Porteiro();
		porteiro.BoasVindas(pe);
		
		
		
		
	}

}
