import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class CarrinhoDeCompras extends JFrame {
	ImageIcon imagem;
	JMenuBar barra;
	JMenu menu;
	JTextField texto;
	JLabel icone;
	JButton botao;
	JTable tabela;
	JScrollPane rolo;
	String[] colunas = {"Nome", "Autor", "Preço/uni","Diponivel","Quantidade"};
	String[][] lista = {{"O engenhoso", "Miguel", "10.34","10","2"},
			{"O poder do habito", "Charles Duh", "29.90","15","2"},
	{"Guia Tecnico de Redes", "Equipe Dige", "19.95","4","3"},
	{"Vendas na Internet", "Equipe tudo", "6.50","11","1"}};
	
	public CarrinhoDeCompras() {
		Incremento1();
		Incremento2();
		Incremento3();
		Incremento4();
		Incremento5();
		Incremento6();
		Incremento7();
		Incremento8();
		Incremento9();
		setTitle("Livraria SJT - Carrinho de Compras");
		setSize(700, 580);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		tabela = new JTable(lista, colunas) {
			public boolean isCellEditable(int lista,int colunas) {
				return colunas == 4;
			}
			public Component prepareRenderer(TableCellRenderer r, int lista, int colunas) {
				Component c = super.prepareRenderer(r, lista, colunas);
				if(lista % 2 == 0) {
					c.setBackground(Color.LIGHT_GRAY);
				}
				else {
					c.setBackground(Color.WHITE);
				}
				return c;
			}
		};
		tabela.setBounds(200, 170, 300, 300);
		tabela.setBorder(BorderFactory.createBevelBorder(1));
		rolo = new JScrollPane(tabela);
		rolo.setBounds(200, 170, 300, 300);
		add(rolo);
	}
	public void Incremento1() {
		imagem = new ImageIcon("Imagem/IMG-20210402-WA0003.jpg");
		icone = new JLabel(imagem, JLabel.CENTER);
		icone.setBounds(300, 18, 90, 90);
		add(icone);
	}
	public void Incremento2() {
		imagem = new ImageIcon("Imagem/IMG-20210402-WA0006.jpg");
		icone = new JLabel(imagem, JLabel.CENTER);
		icone.setBounds(0, 18, 50, 50);
		add(icone);
	}
	public void Incremento3() {
		imagem = new ImageIcon("Imagem/IMG-20210402-WA0004.jpg");
		botao = new JButton(imagem);
		botao.setBounds(50, 18, 50, 50);
		botao.setBorder(BorderFactory.createBevelBorder(0));
		add(botao);
	}
	public void Incremento4() {
		icone = new JLabel("Livros adicionados", JLabel.CENTER);
		icone.setFont(new Font("Arial", Font.BOLD, 17));
		icone.setBorder(BorderFactory.createBevelBorder(1));
		icone.setBounds(200, 140, 300, 30);
		add(icone);
		
	}
	public void Incremento5() {
		float total = 0;
		int disponivel = 0;
		int quant = lista.length;
		for(int i = 0;i<lista.length;i++) {
			total += Float.parseFloat(lista[i][2])*Float.parseFloat(lista[i][4]);
			disponivel = Integer.parseInt(lista[i][3])-Integer.parseInt(lista[i][4]);
			lista[i][3] = ""+disponivel;
		}
		icone = new JLabel("Total: "+total, JLabel.CENTER);
		icone.setFont(new Font("Arial", Font.BOLD, 14));
		icone.setBorder(BorderFactory.createBevelBorder(1));
		icone.setBounds(200, 470, 300, 30);
		add(icone);
		
	}
	public void Incremento6() {
		botao = new JButton("Continuar Comprando");
		botao.setFont(new Font("Arial", Font.BOLD, 14));
		botao.setBorder(BorderFactory.createBevelBorder(0));
		botao.setBounds(30, 510, 300, 30);
		add(botao);
	}
	public void Incremento7() {
		botao = new JButton("Finalizar Compra");
		botao.setFont(new Font("Arial", Font.BOLD, 14));
		botao.setBorder(BorderFactory.createBevelBorder(0));
		botao.setBounds(360, 510, 300, 30);
		add(botao);
	}
	public void Incremento8() {
		barra = new JMenuBar();
		barra.setBounds(0, 2, 684, 15);
		menu = new JMenu("Usuário");
		barra.add(menu);
		add(barra);
		
	}
	public void Incremento9() {
		imagem = new ImageIcon("Imagem/fechar.jpg");
		botao = new JButton(imagem);
		botao.setBounds(100, 18, 50, 50);
		botao.setBorder(BorderFactory.createBevelBorder(0));
		add(botao);
	}
	
	
	
	public static void main(String[] args) {
		new CarrinhoDeCompras();
	}
	
	
	
	

}
