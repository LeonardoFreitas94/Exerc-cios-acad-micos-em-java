import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Informa��esDoEleitor extends JanelaPadrao{
	String nome;
	String idade;
	String sexo;
	JTextField texto;
	JRadioButton op�ao1;
	JRadioButton op�ao2;
	JFormattedTextField formato;
	MaskFormatter mascara;
	ButtonGroup Grupo;
	public class OuvinteNome implements KeyListener{
		public void keyTyped(KeyEvent e) {
			char C = e.getKeyChar();
			if(!Character.isLetter(C) && C != ' ') {
				e.consume();
			}
		}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
	}
	public class OuvinteBotao implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			nome = getTexto().getText();
			idade = getFormato().getText();
			if(getOp�ao1().isSelected()) {
				sexo = "Masculino";
			}
			else if(getOp�ao1().isSelected()) {
				sexo = "Feminino";
			}
			JOptionPane.showMessageDialog(null, "Informa��es cadastradas com sucesso");
			JOptionPane.showMessageDialog(null, getNome());
			JOptionPane.showMessageDialog(null, getIdade());
			JOptionPane.showMessageDialog(null, getSexo());
		}	
	}
	public Informa��esDoEleitor() {
		super();
		Incremento1();
		Incremento2();
		Incremento3();
		Incremento4();
		Incremento5();
		Incremento6();
		Incremento7();
		Incremento8();
	}
	public void Incremento1() {
		titulo = new JLabel("Sistema Vota��o");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(70, 0, 200, 30);
		add(titulo);
	}
	public void Incremento2() {
		titulo = new JLabel("Nome:");
		titulo.setFont(new Font("Arial",Font.BOLD, 12));
		titulo.setBounds(3, 22, 50, 30);
		add(titulo);
	}
	public void Incremento3() {
		titulo = new JLabel("Sexo:");
		titulo.setFont(new Font("Arial",Font.BOLD, 12));
		titulo.setBounds(3, 52, 50, 30);
		add(titulo);
	}
	public void Incremento4() {
		titulo = new JLabel("Idade:");
		titulo.setFont(new Font("Arial",Font.BOLD, 12));
		titulo.setBounds(3, 82, 50, 30);
		add(titulo);
	}
	public void Incremento5() {
		botao = new JButton(">>Prosseguir");
		botao.setFont(new Font("Arial",Font.BOLD, 12));
		botao.setBounds(0, 136, 284, 25);
		OuvinteBotao ouvinte = new OuvinteBotao();
		botao.addActionListener(ouvinte);
		add(botao);
	}
	public void Incremento6() {
		texto = new JTextField();
		texto.setBounds(100, 28, 180, 20);
		OuvinteNome nome = new OuvinteNome();
		texto.addKeyListener(nome);
		add(texto);
	}
	public void Incremento7() {
		op�ao1 = new JRadioButton("M");
		op�ao1.setBounds(140, 54, 40, 20);
		add(op�ao1);
		op�ao2 = new JRadioButton("F");
		op�ao2.setBounds(190, 54, 40, 20);
		add(op�ao2);
		Grupo = new ButtonGroup();
		Grupo.add(op�ao1);
		Grupo.add(op�ao2);
	}
	public void Incremento8() {
		try {
		mascara = new MaskFormatter("##");
		formato = new JFormattedTextField(mascara);
		formato.setBounds(100, 84, 180, 20);
		add(formato);
		}catch(ParseException e) {}
}
	public JTextField getTexto() {
		return texto;
	}
	public JRadioButton getOp�ao1() {
		return op�ao1;
	}
	public JRadioButton getOp�ao2() {
		return op�ao2;
	}
	public JFormattedTextField getFormato() {
		return formato;
	}
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getSexo() {
		return sexo;
	}
}