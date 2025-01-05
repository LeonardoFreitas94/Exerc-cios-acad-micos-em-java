package listaSemanal11;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class LerNomes {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>(); 
		TratamentoDeErros Erro = new TratamentoDeErros(null);
		String N = JOptionPane.showInputDialog("Digite um nome");
		while(!N.equals("fim") && !N.equals("Fim") && !N.equals("FIM")){
			try {
			Erro.TratarErrosNome(N);
			nomes.add(N);
			}catch(CaractereInvalidoException e) {
				e.message();
			}
			N = JOptionPane.showInputDialog("Digite um nome");
		}
		String[] Nomes = nomes.toArray(new String[nomes.size()]);
		

		N =(String) JOptionPane.showInputDialog(null, "Escolha um nome", "Lista de nomes", JOptionPane.INFORMATION_MESSAGE, null, Nomes, Nomes[0]);
		int cont = 0;
		for(int i = 0;i<Nomes.length;i++) {
			if(N.equals(Nomes[i])) {
				cont++;
			}
		}
		String C = ""+cont;
		
		JOptionPane.showMessageDialog(null, "Numero de vezes que o nome "+N+" "+"foi digitado: "+C, JOptionPane.MESSAGE_PROPERTY, JOptionPane.INFORMATION_MESSAGE, null);
		
		
	

	}

}
