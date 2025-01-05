package listaSemanal8;
import java.util.Scanner;



public class programaBatalha {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		exercito A = new exercito1();
		exercito B = new exercito2();
		metodo jog1 = new exercito1();
		metodo jog2 = new exercito2();
		while(A.getDinheiro()>0) {
			System.out.println("Jogador 1");
			System.out.print("Digite a quantidade de catapultas que deseja comprar(Catapultas = 100R$)");
			int C =Integer.parseInt(leitor.nextLine());
			A.compraCatas(C);
			System.out.println("Dinheiro = "+A.getDinheiro());
			if(A.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de infantaria que deseja comprar(Infantaria = 100R$)");
			int I =Integer.parseInt(leitor.nextLine());
			A.compraInfa(I);
			System.out.println("Dinheiro = "+A.getDinheiro());
			if(A.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de cavalaria que deseja comprar(Cavalaria = 100R$)");
			int c =Integer.parseInt(leitor.nextLine());
			A.compraCava(c);
			System.out.println("Dinheiro = "+A.getDinheiro());
			if(A.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de artilharia que deseja comprar(Artilharia = 100R$)");
			int a =Integer.parseInt(leitor.nextLine());
			A.compraArti(a);
			System.out.println("Dinheiro = "+A.getDinheiro());
			if(A.getDinheiro()<=0) {
				break;
			}
		}
		System.out.println("cata "+A.getCatapultas());
		System.out.println("infa "+A.getInfantaria());
		System.out.println("cavala "+A.getCavalaria());
		System.out.println("arti "+A.getArtilharia());
		while(B.getDinheiro()>0) {
			System.out.println("Jogador 2");
			System.out.print("Digite a quantidade de catapultas que deseja comprar(Catapultas = 100R$)");
			int C =Integer.parseInt(leitor.nextLine());
			B.compraCatas(C);
			System.out.println("Dinheiro = "+B.getDinheiro());
			if(B.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de infantaria que deseja comprar(Infantaria = 100R$)");
			int I =Integer.parseInt(leitor.nextLine());
			B.compraInfa(I);
			System.out.println("Dinheiro = "+B.getDinheiro());
			if(B.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de cavalaria que deseja comprar(Cavalaria = 100R$)");
			int c =Integer.parseInt(leitor.nextLine());
			B.compraCava(c);
			System.out.println("Dinheiro = "+B.getDinheiro());
			if(B.getDinheiro()<=0) {
				break;
			}
			System.out.print("Digite a quantidade de artilharia que deseja comprar(Atilharia = 100R$)");
			int a =Integer.parseInt(leitor.nextLine());
			B.compraArti(a);
			System.out.println("Dinheiro = "+B.getDinheiro());
			if(B.getDinheiro()<=0) {
				break;
			}
		}
		System.out.println("cata "+B.getCatapultas());
		System.out.println("infa "+B.getInfantaria());
		System.out.println("cavala "+B.getCavalaria());
		System.out.println("arti "+B.getArtilharia());
		
		A.lista();
		B.lista();
		
		int uni = A.unidades[0] + A.unidades[1] + A.unidades[2] + A.unidades[3];
		int uni2 = B.unidades[0] + B.unidades[1] + B.unidades[2] + B.unidades[3];
		
		
		while(uni>0 && uni2>0) {
			System.out.println("as unidades estão referenciadas por numeros de 0 a 3");
			System.out.println("(0)catapultas");
			System.out.println("(1)infantaria");
			System.out.println("(2)cavalaria");
			System.out.println("(3)artilharia");
			System.out.print("Jogador 1 defende, selecione uma unidade: ");
			int def1 =Integer.parseInt(leitor.nextLine());
			if(A.unidades[def1]==0) {
				System.out.println("você não tem mais unidades desse tipo, ");
				System.out.println("faça outra escolha");
			}
			else {
				System.out.print("Jogador 2 ataca, selecione uma unidade: ");
				int atak2 =Integer.parseInt(leitor.nextLine());
				if(B.unidades[atak2]==0) {
					System.out.println("você não tem mais unidades desse tipo, ");
					System.out.println("faça outra escolha");
				}
				else {
					if(def1>3 || def1<0 && atak2>3 || atak2<0) {
						System.out.println("Há algum numero invalido, tente novamente.");
					}
					else {
						jog1.ganhaQuandoAtacado(def1, atak2);
						if(jog1.ganhaQuandoAtacado(def1, atak2)==true) {
							System.out.println("jogador 1 venceu");
							B.unidades[atak2]--;
						}
						else if(def1 == atak2) {
							System.out.println("Unidades iguais, os dois perdem");
							A.unidades[def1]--;
							B.unidades[atak2]--;
							
						}
						else {
							System.out.println("jogador 2 venceu");
							A.unidades[def1]--;
						}
						uni = A.unidades[0] + A.unidades[1] + A.unidades[2] + A.unidades[3];
					
						System.out.print("Jogador 2 defende, selecione uma unidade: ");
						int def2 =Integer.parseInt(leitor.nextLine());
						if(B.unidades[def2]==0) {
							System.out.println("você não tem mais unidades desse tipo, ");
							System.out.println("faça outra escolha");
						}
						else {
							System.out.print("Jogador 1 ataca, selecione uma unidade: ");
							int atak1 =Integer.parseInt(leitor.nextLine());
							if(A.unidades[atak1]==0) {
								System.out.println("você não tem mais unidades desse tipo, ");
								System.out.println("faça outra escolha");
							}
							else {
								if(def2>3 || def2<0 && atak1>3 || atak1<0) {
									System.out.println("Há algum numero invalido, tente novamente.");
								}
								else {
									jog2.ganhaQuandoAtacado(def2, atak1);
									if(jog2.ganhaQuandoAtacado(def2, atak1)==true) {
										System.out.println("jogador 2 venceu");
										A.unidades[atak1]--;
									}
									else if(def2 == atak1) {
										System.out.println("Unidades iguais, os dois perdem");
										A.unidades[def2]--;
										B.unidades[atak1]--;
									}
									else {
										System.out.println("jogador 1 venceu");
										B.unidades[def2]--;
									}
									
									uni = A.unidades[0] + A.unidades[1] + A.unidades[2] + A.unidades[3];
									uni2 = B.unidades[0] + B.unidades[1] + B.unidades[2] + B.unidades[3];
									if(uni==0) {
										System.out.print("jogador 2 venceu");
										break;
									}
									else if(uni2==0) {
										System.out.print("jogador 1 venceu");
										break;
									}
								
									
									System.out.println("player 1 "+"Catapultas "+A.unidades[0]+" Infantaria "+A.unidades[1]+" Cavalaria "+A.unidades[2]+" Atilharia "+A.unidades[3]);
									
									System.out.println("player 2 "+"Catapultas "+B.unidades[0]+" Infantaria "+B.unidades[1]+" Cavalaria "+B.unidades[2]+" Artilharia "+B.unidades[3]);
								}
							}
						}
					}
				}
			}
		}
	}
}
