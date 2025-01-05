package lista6;
import java.util.Scanner;

public class programaParImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Nome do usuário ");
		jogador usuario = new jogador(leitor.nextLine());
		jogador computador = new jogador("Maquina");
		while(usuario.getQuantidadeDePontos()<10 && computador.getQuantidadeDePontos()<10) {
			int aleatorio = sorteador.sortear(10);
			System.out.print("Informe um numero de 1 a 10: ");
			int num = Integer.parseInt(leitor.nextLine());
			if(num>10) {
				System.out.println("numero invalido");
				break;
			}
			int resultado = aleatorio + num;
			System.out.println("numero da maquina "+aleatorio);
			System.out.println("resultado "+resultado);
			if(resultado % 2 == 0) {
				usuario.addPonto();
			}
			else
				computador.addPonto();
			System.out.println("placar "+" "+usuario.getNome()+" "+usuario.getQuantidadeDePontos()+" x "+computador.getQuantidadeDePontos()+" "+computador.getNome());
			
		if(usuario.getQuantidadeDePontos()==10) {
				System.out.println("vencedor "+usuario.getNome());
				System.out.println("pontos "+usuario.getQuantidadeDePontos());
		}
		else if(computador.getQuantidadeDePontos()==10) {
				System.out.println("vencedor "+computador.getNome());
				System.out.println("pontos "+computador.getQuantidadeDePontos());
		}
		
	}
}
}
