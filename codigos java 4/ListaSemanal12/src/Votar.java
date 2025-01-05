import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Votar extends JanelaPadrao{
	String[] N = {"Candidato A", "Candidato B", "Candidato C"}; 
	JComboBox<String> candidatos = new JComboBox<String>(N);
	public Votar() {
		super();
		Incremento1();
		Incremento2();
		Incremento3();
	}
	public class OuvinteBotao implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
	}
}
	
	public void Incremento1() {
		titulo = new JLabel("Escolha Candidato");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(70, 0, 200, 30);
		add(titulo);
	}
	public void Incremento2() {
		botao = new JButton(">>Prosseguir");
		botao.setFont(new Font("Arial",Font.BOLD, 12));
		botao.setBounds(0, 136, 284, 25);
		OuvinteBotao ouvinte = new OuvinteBotao();
		botao.addActionListener(ouvinte);
		add(botao);
	}
	public void Incremento3() {
		candidatos = new JComboBox();
		candidatos.setBounds(70, 30, 120, 25);
		add(candidatos);
	}
	
}

