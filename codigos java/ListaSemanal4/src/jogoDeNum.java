import java.util.Scanner;
import java.util.ArrayList;
public class jogoDeNum {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			numeros.add((int)(Math.random()*100));
		}
		System.out.println(numeros);
		System.out.print("Selecione um numero de 1 a 10 na lista: ");
		int posição = Integer.parseInt(leitor.nextLine());
		int valor = numeros.get(posição-1);
		numeros.remove(posição-1);
		System.out.println("Você escolheu o numero "+valor+" na lista");
		int pontos = 0;
		while(numeros.size()>1) {
			System.out.printf("Selecione um numero entre 1 e %d na lista: ",numeros.size());
			int comparar = Integer.parseInt(leitor.nextLine());
			int valor1 = numeros.get(comparar-1);
			numeros.remove(comparar-1);
			System.out.println("Você escolheu o numero "+valor1+" na lista");
			if(valor1>valor) {
				valor = valor1;
				pontos++;}
			else {
				break;}
		}
		if(numeros.size()>1) {
			System.out.println("Você perdeu");
			System.out.print("pontuação "+pontos);
		}
		else if(numeros.size()>valor) {
			pontos++;
			System.out.print("Você venceu");
			System.out.print("pontuação "+pontos);
		}
		else {
			System.out.print("Você perdeu");
			System.out.print("pontuação "+pontos);
		}
			
			
			
			
			
				
				
			
		}
			
			
			
		}
	


