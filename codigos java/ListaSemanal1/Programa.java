import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
		Carro c= new Carro();
		System.out.print("Modelo ");
		c.setModelo(leitor.nextLine());
		System.out.print("Autonomia ");
		c.setAutonomia(leitor.nextInt());
		System.out.print("Capacidade de tanque ");
		c.setCapacidadeDeTanque(leitor.nextInt());
		System.out.print("Distancia pretendida ");
		int Dist=leitor.nextInt();
		planejador p= new planejador();
		int x = p.EstimarAbastecimentos(c,Dist);
		System.out.print("Abastecimentos: " + " " + x + " " + "Para" + " " + c.getModelo());
		
	}
	

}
