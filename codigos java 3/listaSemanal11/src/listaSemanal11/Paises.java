package listaSemanal11;
import javax.swing.JOptionPane;
public class Paises {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		String[] paises = {"Brasil","EUA","Espanha","It�lia","Fran�a"};
		String escolha =(String) JOptionPane.showInputDialog(null, "Escolha um pa�s", "Lista de pa�ses", JOptionPane.INFORMATION_MESSAGE, null, paises, paises[0]);
		Sauda�ao S = new Sauda�ao(escolha);
		S.Saudar();
		
		
		
	

}
}




