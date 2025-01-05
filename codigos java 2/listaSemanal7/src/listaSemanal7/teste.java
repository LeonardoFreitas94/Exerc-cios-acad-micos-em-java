package listaSemanal7;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite uma mensagem: ");
		String M = leitor.nextLine();
		System.out.print("Escolha um formatador: ");
		System.out.print("Digite 1 para retornar maiuscula, ");
		System.out.print("Digite 2 para retornar minuscula, ");
		System.out.print("Digite 3 para inverter. ");
		String  D = leitor.nextLine();
		if(D.equals("1")) {
			maiuscula m = new maiuscula(M);
			System.out.print(m.formatarTexto());
		}
		else if(D.equals("2")) {
			minuscula m = new minuscula(M);
			System.out.print(m.formatarTexto());
		}
		else if(D.equals("3")) {
			invertida m = new invertida(M);
			System.out.print(m.formatarTexto());
		}
		else
			System.out.print("informação invalida");
		
			

	}
}

