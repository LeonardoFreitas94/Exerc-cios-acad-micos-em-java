import java.util.Scanner;

public class ProgramaContarValores {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Você deseja fornecer um numero? ");
		String resposta = leitor.nextLine();
		int[] vezes = new int[101];
		int cont = 1;
		while(resposta.equals("sim")) {
			System.out.print("Informe o"+" "+cont+"° numero ");
			int num = Integer.parseInt(leitor.nextLine());
			if(num<0 || num>100) {
				System.out.println("Esse numero  não é valido");
				System.out.print("Você deseja fornecer um numero? ");
				String res = leitor.nextLine();
				resposta = res;
				
			}
			else {
				vezes[num]++;
				System.out.print("Você deseja fornecer um numero? ");
				String res = leitor.nextLine();
				resposta = res;
				cont++;
			}
			
			
			
		}
		int i = 0;
		for( i = 0; i<vezes.length; i++) {
			if(vezes[i]>0)
				System.out.println("O numero"+" "+i+" "+"foi lido"+" "+vezes[i]+" "+"vez(es)");
				
			
		}
		
		
	}
	

}
