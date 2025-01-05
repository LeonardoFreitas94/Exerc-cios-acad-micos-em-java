package listaSemanal7;
import java.util.Scanner;

public class conta {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Qual conta deseja fazer?: ");
		System.out.print("digite 1 para adição, ");
		System.out.print("digite 2 para subtração, ");
		System.out.print("digite 3 para multiplicação, ");
		System.out.print("digite 4 para divisão.: ");
		String C = leitor.nextLine();
		if(C.equals("1") || C.equals("2") || C.equals("3") || C.equals("4")){
			System.out.print("digite o valor 1 ");
			int V1 = Integer.parseInt(leitor.nextLine());
			System.out.print("digite o valor 2 ");
			int V2 = Integer.parseInt(leitor.nextLine());
			switch(C) {
				case "1":
					adiçao A = new adiçao(V1 , V2);
					System.out.print("Resultado "+A.fazerConta());
					break;
				case "2":
					subtraçao S = new subtraçao(V1 , V2);
					System.out.print("Resultado "+S.fazerConta());
					break;
				case "3":
					multiplicaçao M = new multiplicaçao(V1 , V2);
					System.out.print("Resultado "+M.fazerConta());
					break;
				case "4":
					divisao D = new divisao(V1 , V2);
					System.out.print("Resultado "+D.fazerConta());
					break;		
			}
		}
		else
			System.out.print("Numero invalido");
			

	}

}
