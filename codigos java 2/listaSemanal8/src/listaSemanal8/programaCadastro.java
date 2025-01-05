package listaSemanal8;
import java.util.Scanner;

public class programaCadastro{

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		analistas[] A = new analistas[2];
		int cont = 0;
		System.out.print("Deseja efetuar novo cadastro?: ");
		String D = leitor.nextLine();
		while(D.equals("sim") || D.equals("Sim") || D.equals("SIM") ) {
			System.out.print("Digite o nome ");
			String N = leitor.nextLine();
			System.out.print("Digite o nivel ");
			int n = Integer.parseInt(leitor.nextLine());
			System.out.println("Escolha um numero referente ao tipo de analista que deseja cadastrar");
			System.out.println("(1) Analista Junior");
			System.out.println("(2) Analista Pleno");
			System.out.println("(3) Analista Sênior");
			System.out.println("(4) Analista Estagiário");
			String T = leitor.nextLine();
			switch(T) {
				case "1":
					A[cont] = new analistaJunior();
					A[cont].setNome(N);
					A[cont].setNivel(n);
					cont++;
					break;
				case "2":
					A[cont] = new analistaPleno();
					A[cont].setNome(N);
					A[cont].setNivel(n);
					cont++;
					break;
				case "3":
					A[cont] = new analistaSenior();
					A[cont].setNome(N);
					A[cont].setNivel(n);
					cont++;
					break;
				case "4":
					A[cont] = new analistaEstagiario();
					A[cont].setNome(N);
					A[cont].setNivel(n);
					cont++;
					break;
				default:
					System.out.println("Escolha um numero de 1 a 4.");
			}
			if(cont==A.length) {
				analistas[] nova = new analistas[A.length+2];
				for(int i = 0; i<A.length; i++) { 
					nova[i] = A[i];
				}
				A = nova;
				}
			System.out.print("Deseja efetuar novo cadastro?: ");
			D = leitor.nextLine();
		}
		
		int junior = 0;
		int pleno = 0;
		int senior = 0;
		int estagiario = 0;
		for(int i = 0;i<A.length;i++) {
			if(A[i]==null) {
				break;
			}
			else if(A[i].getClass().getSimpleName().equals("analistaJunior")) {
				junior++;
			}
			else if(A[i].getClass().getSimpleName().equals("analistaPleno")) {
				pleno++;
			}
			else if(A[i].getClass().getSimpleName().equals("analistaSenior")) {
				senior++;
			}
			else {
				estagiario++;
			}
		}
		System.out.println("Analistas Junior: "+junior+", ");
		System.out.println("Analistas Pleno: "+pleno+", ");
		System.out.println("Analistas Senior: "+senior+", ");
		System.out.println("Analistas Estagiário: "+estagiario+", ");
		float maior = 0;
		String nome = null;
		for(int i = 0;i<A.length;i++) {
			if(A[i]==null) {
				break;
			}
			else if(A[i].salarioFinal()>maior) {
				maior = A[i].salarioFinal();
				nome = A[i].getNome()+" "+A[i].getClass().getSimpleName();
			}
			else
				continue;
		}
		System.out.println("Analista com maior salario "+nome+":"+" "+maior);
		float menor = A[0].salarioFinal();
		String nome2 = A[0].getNome()+" "+A[0].getClass().getSimpleName();
		for(int i = 0;i<A.length;i++) {
			if(A[i]==null) {
				break;
			}
			else if(A[i].salarioFinal()<menor) {
				menor = A[i].salarioFinal();
				nome2 = A[i].getNome()+" "+A[i].getClass().getSimpleName();
			}
			else
				continue;
		}
		System.out.println("Analista com menor salario "+nome2+":"+" "+menor);
		
	


}
}	
