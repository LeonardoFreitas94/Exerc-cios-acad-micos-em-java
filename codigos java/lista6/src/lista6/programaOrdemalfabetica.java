package lista6;
import java.util.Arrays;
import java.util.Scanner;
public class programaOrdemalfabetica {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome de dez pessoas separado por virgula");
		String[] nome = (leitor.nextLine()).split(",");
		String[] ordem = new String[2];
		int posi�ao1 = sorteador.sortear(nome.length);
		ordem[0] = nome[posi�ao1];
		nome[posi�ao1]= null;
		int posi�ao2 = sorteador.sortear(nome.length);
		if(nome[posi�ao2]==null) {
			ordem[1] = nome[posi�ao2 - 1];
		}
		else
			ordem[1] = nome[posi�ao2];
		nome[posi�ao2]= null;
		Arrays.sort(ordem);
		System.out.println(ordem[0]);
		System.out.println(ordem[1]);
	}

}
