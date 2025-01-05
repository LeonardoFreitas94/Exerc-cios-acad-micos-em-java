package lista6;
import java.util.Arrays;
import java.util.Scanner;
public class programaOrdemalfabetica {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome de dez pessoas separado por virgula");
		String[] nome = (leitor.nextLine()).split(",");
		String[] ordem = new String[2];
		int posiçao1 = sorteador.sortear(nome.length);
		ordem[0] = nome[posiçao1];
		nome[posiçao1]= null;
		int posiçao2 = sorteador.sortear(nome.length);
		if(nome[posiçao2]==null) {
			ordem[1] = nome[posiçao2 - 1];
		}
		else
			ordem[1] = nome[posiçao2];
		nome[posiçao2]= null;
		Arrays.sort(ordem);
		System.out.println(ordem[0]);
		System.out.println(ordem[1]);
	}

}
