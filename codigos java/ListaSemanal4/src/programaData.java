import java.util.Scanner;


public class programaData {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite uma data neste formato ##/##/####  ");
		String[] data = (leitor.nextLine()).split("/");
		switch(data[1]) {
			case "01":
				System.out.print(data[0]+" de Janeiro de "+data[2]);
				break;
			case "02":
				System.out.print(data[0]+" de Fevereiro de "+data[2]);
				break;
			case "03":
				System.out.print(data[0]+" de Março de "+data[2]);
				break;
			case "04":
				System.out.print(data[0]+" de Abril de "+data[2]);
				break;
			case "05":
				System.out.print(data[0]+" de Maio de "+data[2]);
				break;
			case "06":
				System.out.print(data[0]+" de Junho de "+data[2]);
				break;
			case "07":
				System.out.print(data[0]+" de Julho de "+data[2]);
				break;
			case "08":
				System.out.print(data[0]+" de Agosto de "+data[2]);
				break;
			case "09":
				System.out.print(data[0]+" de Setembro de "+data[2]);
				break;
			case "10":
				System.out.print(data[0]+" de Outubro de "+data[2]);
				break;
			case "11":
				System.out.print(data[0]+" de Novembro de "+data[2]);
				break;
			case "12":
				System.out.print(data[0]+" de Dezembro de "+data[2]);
				break;
			default:
				System.out.print("Mês incorreto");
						
					
				}
			}
			
				
				
			
		
			
		
		
		 
			
		}
import java.util.Scanner;

public class VogaisEConsoantes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[] vogais = {"a","e","i","o","u"};
		
		System.out.print("Digite uma frase: ");
		String frase = leitor.nextLine();
		
		int v = 0;
		int c = 0;
		int vazio = 0;
		
		for (String elemento : vogais) {
			for (int i = 0; i < frase.length(); i++) {
				if (elemento.equals(String.valueOf(frase.charAt(i)))) {
					v++;
				}
			}
		}
		
		for (int i = 0; i < frase.length(); i++) {
			if (String.valueOf(frase.charAt(i)).equals(" ")){
				vazio++;
			}
		}
		
		c = frase.length() - vazio - v;
		
		System.out.println("\nVogais: " + v);
		System.out.println("Consoantes: " + c);
	}
}


