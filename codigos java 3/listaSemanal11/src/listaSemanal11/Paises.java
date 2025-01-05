package listaSemanal11;
import javax.swing.JOptionPane;
public class Paises {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		String[] paises = {"Brasil","EUA","Espanha","Itália","França"};
		String escolha =(String) JOptionPane.showInputDialog(null, "Escolha um país", "Lista de países", JOptionPane.INFORMATION_MESSAGE, null, paises, paises[0]);
		Saudaçao S = new Saudaçao(escolha);
		S.Saudar();
		
		
		
	

}
}




