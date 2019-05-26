package telaLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Dados;
import telaAdm.TelaAdministrador;
import telaCriaConta.TelaCriaConta;
import telaHomePage.TelaHomePage;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Acao a = new Acao();

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(10, 21, 56, 19);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(10, 46, 48, 19);
		contentPane.add(lblSenha);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(72, 22, 204, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(10, 76, 89, 23);
		contentPane.add(btnEntrar);

		JButton btnCriarConta = new JButton("N\u00E3o tenho uma conta");
		btnCriarConta.setBounds(116, 76, 160, 23);
		contentPane.add(btnCriarConta);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(72, 47, 204, 20);
		contentPane.add(txtSenha);

		// AÇÕES DOS
		// BOTÕES-----------------------------------------------------------------------------------------------------------------------
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				TelaCriaConta f = new TelaCriaConta();
				f.setVisible(true);
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String[] temp = new String[] { txtUsuario.getText(), txtSenha.getText() };
				if (a.FazLogin(temp)) {
					if (Dados.userLogado.equals("admin")) {
						setVisible(false);
						TelaAdministrador f = new TelaAdministrador();
						f.setVisible(true);
					} else {
						setVisible(false);
						TelaHomePage f = new TelaHomePage();
						f.setVisible(true);
					}
				}
			}
		});
	}
}
