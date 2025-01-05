package lista6;
import java.util.Random;

public class sorteador {
	
	public static int sortear(int max) {
		return (int)(Math.random()*max);
		
	}
	public static int sortear(int min, int max) {
		Random r = new Random();
		int num = (int)(min + r.nextInt((max - min) + 1));
		return num;
	}
	public static String sortear(String[] op) {
		int posiçao = (int)(Math.random()* op.length);
		return op[posiçao];
	}
}

