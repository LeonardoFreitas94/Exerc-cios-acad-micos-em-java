package listaSemanal8;

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		pokemon P = new pokemonGenerico();
		P.setNome("pika");
		P.setTipo("eletrico");
		P.setNivel(30);
		System.out.println(P.ataqueA());
		System.out.println(P.ataqueB());
		System.out.println(P.ataqueC());
		System.out.println(P.ataqueD());
		System.out.println(P.ataqueE());
		
	}
}
