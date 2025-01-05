package listaSemanal11;
import javax.swing.JOptionPane;
public class Calcular {

	public static void main(String[] args) throws VetorIncorretoException {
		String[] Op = {"Somar","Subtrair","Multiplicar","Dividir"};
		String S = JOptionPane.showInputDialog("Crie uma senha");

		
		String N = JOptionPane.showInputDialog("Digite dois numeros separados por virgula");
		String[] numeros = N.split(",");
		TratamentoDeErros ERRO = new TratamentoDeErros(null);
		while(numeros.length>0) {
			try {
				ERRO = new TratamentoDeErros(numeros);
				ERRO.TratarErros();
			break;
			}catch(VetorIncorretoException e) {
				N = JOptionPane.showInputDialog("Digite dois numeros separados por virgula");
				numeros = N.split(",");
			}
		}
		
		int operador = JOptionPane.showOptionDialog(null, "Escolha um operador matemático", "Calcular", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, Op, Op[0]);
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		while(true) {
			try {
			if(senha==null) {
				JOptionPane.showMessageDialog(null, "O resultado não pode ser exibido", "Erro", JOptionPane.ERROR_MESSAGE);
				break;
			}
			ERRO.TratarErrosSenha(S, senha);
			EfetuarCalculo C = new EfetuarCalculo(operador,Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1]));
			C.Resultado();
			break;
		}catch(SenhaIncorretaException e) {
			senha = JOptionPane.showInputDialog("Digite sua senha");
		}
		

}
}
}	
