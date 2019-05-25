package telaProcessador;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import telaHddSdd.TelaHddSdd;
import telaHomePage.TelaHomePage;
import telaMemoriaRam.TelaMemoriaRam;
import telaPerifericos.TelaPerifericos;
import telaPlacaVideo.TelaPlacaVideo;

@SuppressWarnings("serial")
public class TelaProcessador extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaProcessador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMonster = new JLabel("MONSTER");
		lblMonster.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMonster.setBounds(10, 11, 193, 49);
		contentPane.add(lblMonster);

		JLabel lblInformtica = new JLabel("Inform\u00E1tica");
		lblInformtica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInformtica.setBounds(52, 58, 90, 22);
		contentPane.add(lblInformtica);

		JButton btnMinhaConta = new JButton("Minha conta");
		btnMinhaConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMinhaConta.setBounds(510, 11, 120, 30);
		contentPane.add(btnMinhaConta);

		JButton btnMeuCarrinho = new JButton("Meu carrinho");
		btnMeuCarrinho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMeuCarrinho.setBounds(640, 11, 120, 30);
		contentPane.add(btnMeuCarrinho);

		JButton btnDeslogar = new JButton("Deslogar");
		btnDeslogar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeslogar.setBounds(380, 11, 120, 30);
		contentPane.add(btnDeslogar);

		// Cria �cone para bot�o pesquisa
		ImageIcon iconPesquisa = new ImageIcon(TelaHomePage.class.getResource("iconPesquisa.jpg"));
		Image temp = iconPesquisa.getImage();
		Image newimg = temp.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedIconPesquisa = new ImageIcon(newimg);

		JButton btnColocarimagemLupa = new JButton(resizedIconPesquisa);
		btnColocarimagemLupa.setBounds(730, 58, 30, 30);
		contentPane.add(btnColocarimagemLupa);

		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(380, 58, 340, 30);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);

		JButton btnPlacaDeVdeo = new JButton("Placa de V\u00EDdeo");
		btnPlacaDeVdeo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPlacaDeVdeo.setBounds(10, 131, 142, 30);
		contentPane.add(btnPlacaDeVdeo);

		JButton btnProcessador = new JButton("Processador");
		btnProcessador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProcessador.setBounds(162, 131, 142, 30);
		contentPane.add(btnProcessador);

		JButton btnHddSsd = new JButton("HDD/SSD");
		btnHddSsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHddSsd.setBounds(314, 131, 142, 30);
		contentPane.add(btnHddSsd);

		JButton btnMemriaRam = new JButton("Mem\u00F3ria RAM");
		btnMemriaRam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMemriaRam.setBounds(466, 131, 142, 30);
		contentPane.add(btnMemriaRam);

		JButton btnPerifricos = new JButton("Perif\u00E9ricos");
		btnPerifricos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerifricos.setBounds(618, 131, 142, 30);
		contentPane.add(btnPerifricos);

		btnPlacaDeVdeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaPlacaVideo f = new TelaPlacaVideo();
				f.setVisible(true);
			}
		});

		btnProcessador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProcessador f = new TelaProcessador();
				f.setVisible(true);
			}
		});

		btnHddSsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaHddSdd f = new TelaHddSdd();
				f.setVisible(true);
			}
		});

		btnMemriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaMemoriaRam f = new TelaMemoriaRam();
				f.setVisible(true);
			}
		});

		btnPerifricos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaPerifericos f = new TelaPerifericos();
				f.setVisible(true);
			}
		});

		lblMonster.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});

		lblInformtica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});
	}

}