package listaSemanal11;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JanelaPadrão extends JFrame {
	public JanelaPadrão() {
		setTitle("Cadastro de Clientes - Acesso");
		Botao();
		campoDeTexto();
		Nome();
		icone();
		setSize(468, 215);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setForeground(Color.GRAY);
	}
	public void icone() {
		ImageIcon img = new ImageIcon("bandeiras/imagem chave.png");
		JLabel icone = new JLabel(img, JLabel.CENTER);
		icone.setBounds(0, 30, 200, 100);
		add(icone);
	}
	public void Nome() {
		JLabel icone = new JLabel("Nome:", JLabel.CENTER);
		icone.setBounds(130, 10, 200, 100);
		icone.setFont(new Font("Arial", Font.BOLD, 15));
		add(icone);
		icone = new JLabel("Senha:", JLabel.CENTER);
		icone.setBounds(130, 40, 200, 100);
		icone.setFont(new Font("Arial", Font.BOLD, 15));
		icone.setForeground(Color.RED);
		add(icone);
	}
	public void campoDeTexto() {
		JTextField campo = new JTextField();
		campo.setBounds(280, 50, 150, 20);
		add(campo);
		campo = new JTextField();
		campo.setBounds(280, 80, 150, 20);
		add(campo);
	}
	public void Botao() {
		JButton botao = new JButton("Entrar");
		botao.setFont(new Font("Arial", Font.BOLD, 15));
		botao.setForeground(Color.GREEN);
		botao.setBounds(280, 120, 110, 25);
		add(botao);
	}

}
