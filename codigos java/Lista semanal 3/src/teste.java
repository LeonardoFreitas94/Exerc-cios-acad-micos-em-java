import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantidade de roupas ");
		int qt =Integer.parseInt(leitor.nextLine());
		Roupa[] Roupa = new Roupa[qt];
		for(int i = 0; i<qt; i++) {
			Roupa[i] = new Roupa();
		}
		for(int i = 0; i<qt; i++) {
			System.out.print("Informe se a roupa está suja ou limpa ");
			String n = leitor.nextLine();
			if(n.equals("limpa")) {
				Roupa[i].setestado(Estado.LIMPA);
			}
			else 
				Roupa[i].setestado(Estado.SUJA);
			
			System.out.print("Informe a cor da roupa ");
			String c = leitor.nextLine();
			if(c.equals("branco")) {
				Roupa[i].setcor(Cor.BRANCO);
			}
			else 
				Roupa[i].setcor(Cor.COLORIDO);
			
			System.out.print("Informe tamanho da roupa ");
			String t = leitor.nextLine();
			if(t.equals("p")) {
				Roupa[i].settamanho(Tamanho.P);
			}
			else if(t.equals("m")) {
				Roupa[i].settamanho(Tamanho.M);
			}
			else 
				Roupa[i].settamanho(Tamanho.G);
			
		}
		for(int x = 0; x<qt; x++) {
			System.out.println("Estado da roupa"+" "+x+" "+Roupa[x].getestado());
			System.out.println("Cor da roupa"+" "+x+" "+Roupa[x].getcor());
			System.out.println("Tamanho da roupa"+" "+x+" "+Roupa[x].gettamanho());
		}
		MaquinaDeLavar lavar = new MaquinaDeLavar();
		lavar.lavar(Roupa);
		if(lavar.lavar(Roupa)==-1) {
			System.out.println("Não é possivel");
		}
		else {
			System.out.println("tempo necessário para realizar a lavagem"+" "+lavar.lavar(Roupa)+" "+"minutos");
		}
		for(int p = 0; p<qt; p++) {
			System.out.println("Estado da roupa"+" "+p+" "+Roupa[p].getestado());
			System.out.println("Cor da roupa"+" "+p+" "+Roupa[p].getcor());
			System.out.println("Tamanho da roupa"+" "+p+" "+Roupa[p].gettamanho());
		}
	}	
}
			
		
	
				
		
	


