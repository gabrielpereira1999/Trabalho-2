package telaLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import telaCriaConta.TelaCriaConta;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(10, 21, 56, 19);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(10, 46, 48, 19);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(72, 22, 204, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 47, 204, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(10, 76, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnCriarConta = new JButton("N\u00E3o tenho uma conta");
		btnCriarConta.setBounds(116, 76, 160, 23);
		contentPane.add(btnCriarConta);
		
		
		//AÇÕES DOS BOTÕES-----------------------------------------------------------------------------------------------------------------------
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				TelaCriaConta f = new TelaCriaConta();
				f.setVisible(true);
			}
		});
		
		
	}
}
