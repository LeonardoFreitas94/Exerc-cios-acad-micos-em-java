import java.util.Scanner;

public class programaJogo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		jogoMatem�tico jogo = new jogoMatem�tico();
		int cont = 0;
		int questoes = 0;
		while(cont<=3) {
			jogo.sortearCalculo();
			System.out.println("\nDigite a resposta ");
			int res = Integer.parseInt(leitor.nextLine());
			System.out.println(jogo.resposta(res));
			if(jogo.resposta(res)==false) {
				cont++;
			}
			else
				questoes++;
		}
		System.out.println("Acertos "+questoes);
		System.out.println("voc� errou mais que 3 vezes ");
		
				
		
	}
	
	

}
