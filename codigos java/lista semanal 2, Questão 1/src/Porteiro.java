

public class Porteiro {
	
	public void BoasVindas(Pessoa pessoa){
		
		if(pessoa.getIdade()<10 && pessoa.getSexo()=="masculino" || pessoa.getSexo()=="feminino")
			switch(pessoa.getSexo()) {
				case "masculino":
					System.out.print("Olá jovem"+" "+pessoa.getNome());
					break;
				case "feminino":
					System.out.print("Olá jovem"+" "+pessoa.getNome());;
					break;
			}
					
		else
			switch(pessoa.getSexo()) {
				case "masculino":
				System.out.print("Bem vindo Senhor"+" "+pessoa.getNome());
					break;
				case "feminino":
				System.out.print("Bem vinda Senhorita"+" "+pessoa.getNome());
					break;
				default:
				System.out.print("Olá estranho (a)");;
			}
		
		
		
	}
	
}