package listaSemanal11;

import javax.swing.JOptionPane;

public class EfetuarCalculo {
	private int operador;
	private int valor1;
	private int valor2;
	private float resultado;
	
	public EfetuarCalculo(int N, int V1, int V2) {
		this.operador = N;
		this.valor1 = V1;
		this.valor2 = V2;
	}
	
	public void Resultado() {
		switch(operador) {
			case 0:
				resultado = valor1+valor2;
				JOptionPane.showMessageDialog(null, "Resultado da soma: "+(int)resultado);
				break;
			case 1:
				resultado = valor1-valor2;
				JOptionPane.showMessageDialog(null, "Resultado da subtração: "+(int)resultado);
				break;
			case 2:
				resultado = valor1*valor2;
				JOptionPane.showMessageDialog(null, "Resultado da multiplicação: "+(int)resultado);
				break;
			case 3:
				resultado = valor1/valor2;
				JOptionPane.showMessageDialog(null, "Resultado da divisão: "+resultado);
				break;
	}
		
		
		
}

}
