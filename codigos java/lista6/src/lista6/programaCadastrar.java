package lista6;
import java.util.Scanner;

public class programaCadastrar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int cont1 = 0;
		int cont2 = 0;
		contaCorrente[] C = new contaCorrente[100];
		contaPoupança[] P = new contaPoupança[100];
		int max = 0;
		while(max <= 100) {
			System.out.print("Digite sim para cadastrar uma nova conta ou não para interromper");
			String S = leitor.nextLine();
			if(S.equals("não") || S.equals("Não") || S.equals("NÃO")) {
				break;
			}
			else if(S.equals("sim") || S.equals("Sim") || S.equals("SIM")) {
				System.out.print("Digite 1 para cadastrar conta corrente e 2 para cadastar conta poupança ");
				String conta = leitor.nextLine();
				if(conta.equals("1")) {
					cont1++;
					max++;
					System.out.print("Digite o saldo: ");
					float saldo = Float.parseFloat(leitor.nextLine());
					System.out.print("Titular da conta: ");
					String titular = leitor.nextLine();
					System.out.print("numero da conta: ");
					String num = leitor.nextLine();
					System.out.print("Cheque especial: ");
					float cheque = Float.parseFloat(leitor.nextLine());
					for(int i =0; i<C.length; i++) {
						if(C[i] == null) {
							C[i] = new contaCorrente(saldo, titular, num, cheque);
							break;
						}
					}	
							
				}	
				else if(conta.equals("2")) {
					cont2++;
					max++;
					System.out.print("Digite o saldo: ");
					float saldo = Float.parseFloat(leitor.nextLine());
					System.out.print("Titular da conta: ");
					String titular = leitor.nextLine();
					System.out.print("numero da conta: ");
					String num = leitor.nextLine();
					System.out.print("Taxa de rendimento: ");
					float taxa = Float.parseFloat(leitor.nextLine());
					for(int i =0; i<P.length; i++) {
						if(P[i] == null) {
							P[i] = new contaPoupança(saldo, titular, num, taxa);
							break;
						}
					}
				
				}
				else {
					System.out.println("Numero invalido ");
					break;
				}
			}
			else {
				System.out.println("Resposta invalida");
				break;
			}
			
	
		}
		System.out.println("Total de contas correntes: "+cont1);
		for(int i = 0; i<cont1; i++) {
			System.out.println(C[i].toString());
			
		}
		System.out.println("Total de contas poupanças: "+cont2);
		for(int i = 0; i<cont2; i++) {
			System.out.println(P[i].toString());
		}

}
}	
	
