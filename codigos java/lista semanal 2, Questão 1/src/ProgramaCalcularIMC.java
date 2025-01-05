import java.util.Scanner;
import java.text.DecimalFormat;

public class ProgramaCalcularIMC {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa Pe = new Pessoa();
		CalculadoraDeIMC Calcular = new CalculadoraDeIMC();
		System.out.print("Informe sua altura neste formato:(x.xx) ");
		Pe.setAltura(Float.parseFloat(leitor.nextLine()));
		System.out.print("Informe seu peso ");
		Pe.setPeso(Float.parseFloat(leitor.nextLine()));
		float imc = Calcular.CalcularIMC(Pe);
		DecimalFormat For = new DecimalFormat("##.#");
		if(imc<18.5)
			System.out.print(For.format(imc)+" "+"(Abaixo do Peso)");
		else if(imc>=18.5 && imc<=24.9)
			System.out.print(For.format(imc)+" "+"(peso normal)");
		else if(imc>=25 && imc<=29.9)
			System.out.print(For.format(imc)+" "+"(Sobrepeso)");
		else if(imc>=30 && imc<=34.9)
			System.out.print(For.format(imc)+" "+"(Obesidade Grau I)");
		else if(imc>=35 && imc<=39.9)
			System.out.print(For.format(imc)+" "+"(Obesidade Grau II");
		else
			System.out.print(For.format(imc)+" "+"(Obesidade Grau III ou Morbida)");
			
		
		
		
			
		
		
		
	}

}
