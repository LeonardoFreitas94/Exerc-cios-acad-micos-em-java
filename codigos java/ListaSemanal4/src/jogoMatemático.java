
public class jogoMatemático {
	private String calculo;
	private int resposta;
	
	public String getcalculo(){
		return calculo;
	}
	public int getresposta() {
		return resposta;
	}
	public void sortearCalculo() {
		calculo = String.valueOf((int)(Math.random()*101))+" ";
		switch((int)(Math.random()*3)) {
			case 0:
				calculo +="+ ";
				break;
			case 1:
				calculo +="- ";
				break;
			case 2:
				calculo +="/ ";
				break;
			default:
				calculo +="* ";
				
		}
		System.out.print(calculo += String.valueOf((int)(Math.random()*101))+" = ");
		
	}
	public boolean resposta(int R) {
		String[] separar = calculo.split(" ");
		int[] conversor = {Integer.parseInt(separar[0]),Integer.parseInt(separar[2])};
		switch(separar[1]) {
			case "+":
				if(R == conversor[0]+conversor[1]) {
					return true;}
				return false;
			case "-":
				if(R == conversor[0]-conversor[1]) {
					return true;}
				return false;
			case "/":
				if(R == conversor[0]/conversor[1]) {
					return true;}
				return false;
			default:
				if(R == conversor[0]*conversor[1]) {
					return true;}
				return false;
		}
				
				
		}
	}
	
	

		
	


