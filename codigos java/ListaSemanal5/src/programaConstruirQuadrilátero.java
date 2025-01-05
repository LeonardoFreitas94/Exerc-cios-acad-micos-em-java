import java.util.Scanner;

public class programaConstruirQuadril�tero {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("1 - Cadastrar quadril�tero");
		System.out.println("2 - Cadastrar quadrado");
		System.out.println("3 - Desenhar um quadril�tero guardado em uma posi��o espec�fica");
		System.out.println("4 - Contar quantas vezes um quadril�tero est� dentro do array");
		System.out.println("5 - Encontrar o quadril�tero de maior �rea");
		System.out.println("6 - Encontrar o quadrado de maior �rea");
		System.out.println("7 - Encontrar o quadril�tero de menor �rea");
		System.out.println("8 - Encontrar o quadrado de menor �rea");
		System.out.println("9 - Informar a quantidade de quadril�teros cadastrados");
		System.out.println("0 - Informar a quantidade quadrados cadastrados");
		System.out.println("S - Sair");
		
		Quadrilatero[] lista = new Quadrilatero[100];
		
		int contList = 0;
		int contQuadrado = 0;
		String opcao = "";
		
		
		while(contList<100 && opcao.equals("S")==false) {
	
			System.out.print("Digite uma das op��es do menu: ");
			opcao = leitor.nextLine();
			
			if(opcao.equals("1")) {
				System.out.print("Digete a largura: ");
				int l = Integer.parseInt(leitor.nextLine());
				System.out.print("Digite a altura");
				int a = Integer.parseInt(leitor.nextLine());
				
				for(int n =0; n<lista.length; n++) {
					if(lista[n] == null) {
						lista[n] = new Quadrilatero(l,a);
						contList++;
						break;
					}
				}
			}
			
			else if (opcao.equals("2")) {
				System.out.print("Digite o valor do lado do quadrado: ");
				int ladoQ = Integer.parseInt(leitor.nextLine());
				
				for(int n =0; n<lista.length; n++) {
					if(lista[n] == null) {
						lista[n] = new Quadrilatero(ladoQ);
						contList++;
						contQuadrado++;
						break;
					}	
				}
			}
			
			else if(opcao.equals("3")) {
				System.out.print("Indice do quadril�tero que deseja desenhar: ");
				int indice = Integer.parseInt(leitor.nextLine());
				lista[indice].toString();
			}
			
			else if (opcao.equals("4")) {
				int frequenciaPesquisa = 0;
				
				System.out.print("Pesquisa/ largura do quadril�tero: ");
				int larg = Integer.parseInt(leitor.nextLine());
				
				System.out.print("Pesquisa/ altura do quadril�tero: ");
				int alt = Integer.parseInt(leitor.nextLine());
				
				Quadrilatero exemplo = new Quadrilatero(larg,alt);
				
				for (Quadrilatero elemento : lista) {
					if (elemento == null) {
						break;
					}
					else if (exemplo.equals(elemento)) {
						frequenciaPesquisa++;
					}
				}
				
				System.out.println("N�mero de quadril�teros id�nticos na lista: " + frequenciaPesquisa);
			}
			
			else if(opcao.equals("5")) {
				int posicaoM = 0;
				int qMaior = 0;
				for(int i =0; i<lista.length; i++) {
					if(lista[i]==null) {
						break;
					}
					else if(lista[i].area()>qMaior) {
						qMaior = lista[i].area();
						posicaoM = i;
					}
				}
				
				lista[posicaoM].toString();
			}
			else if(opcao.equals("6")) {
				int posicaoM = 0;
				int qMaior = 0;
				for(int i = 0; i<lista.length; i++) {
					if(lista[i]==null) {
						break;
					}
					else if(lista[i].isQuadrado() && lista[i].area()>qMaior) {
						qMaior = lista[i].area();
						posicaoM = i;	
					}
				
				
				}
				lista[posicaoM].toString();
			}
			else if(opcao.equals("7")) {
				int posicaoM = 0;
				int qMenor = lista[0].area();
				for(int i = 1; i<lista.length; i++) {
					if(lista[i]==null) {
						break;
					}
					if(lista[i].area()<qMenor) {
						qMenor = lista[i].area();
						posicaoM = i;
					}
				
				
				}
				lista[posicaoM].toString();
			
			}
			
			
			else if(opcao.equals("8")) {
				int posicaoM = 0;
				int qMenor = 0;
				for(int i =0; i<lista.length; i++) {
					if(lista[i]==null) {
						break;
					}
					else if(lista[i].isQuadrado() && qMenor == 0) {
						qMenor = lista[i].area();
					}
					else if(lista[i].isQuadrado() && lista[i].area()<qMenor) {
						qMenor = lista[i].area();
						posicaoM = i;
					}	
				}
				
				lista[posicaoM].toString();
			}
			
			else if (opcao.equals("9")) {
				System.out.println("Quantidade de quadril�teros cadastrados: " + contList);
			}
			
			else if (opcao.equals("0")) {
				System.out.println("Quantidade de quadrados cadastradis: " + contQuadrado);
			}
		}
		for(Quadrilatero q : lista) {
			if(q==null) {
				break;
			}
			else
				q.toString();
		}
	}
}