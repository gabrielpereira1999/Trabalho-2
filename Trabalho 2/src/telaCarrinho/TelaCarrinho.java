package telaCarrinho;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Dados;
import telaHomePage.TelaHomePage;
import telaLogin.TelaLogin;
import telaPesquisa.TelaPesquisa;
import telaProdutoDpt.TelaProdutoDpt;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TelaCarrinho extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Acao a = new Acao();
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 172, 747, 350);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(a.DimensionTelaCarrinho());
		scrollPane.setViewportView(panel);
		panel.setLayout(null);

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
		
		JButton btnPlacaDeVideo = new JButton("Placa de V\u00EDdeo");
		btnPlacaDeVideo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPlacaDeVideo.setBounds(10, 131, 142, 30);
		contentPane.add(btnPlacaDeVideo);
		
		JButton btnProcessador = new JButton("Processador");
		btnProcessador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProcessador.setBounds(162, 131, 142, 30);
		contentPane.add(btnProcessador);
		
		JButton btnHddSsd = new JButton("HDD/SSD");
		btnHddSsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHddSsd.setBounds(314, 131, 142, 30);
		contentPane.add(btnHddSsd);
		
		JButton btnMemoriaRam = new JButton("Mem\u00F3ria RAM");
		btnMemoriaRam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMemoriaRam.setBounds(466, 131, 142, 30);
		contentPane.add(btnMemoriaRam);
		
		JButton btnPerifericos = new JButton("Perif\u00E9ricos");
		btnPerifericos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerifericos.setBounds(618, 131, 142, 30);
		contentPane.add(btnPerifericos);

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

		JButton btnMemriaRam = new JButton("Mem\u00F3ria RAM");
		btnMemriaRam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMemriaRam.setBounds(466, 131, 142, 30);
		contentPane.add(btnMemriaRam);

		JButton btnPerifricos = new JButton("Perif\u00E9ricos");
		btnPerifricos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPerifricos.setBounds(618, 131, 142, 30);
		contentPane.add(btnPerifricos);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		btnFinalizarCompra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFinalizarCompra.setBounds(260, 540, 264, 39);
		contentPane.add(btnFinalizarCompra);
		
		JPanel panelFimCompra = new JPanel();
		panelFimCompra.setBounds(10, 172, 747, 415);
		contentPane.add(panelFimCompra);
		panelFimCompra.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total: R$ "+a.TotalMesmo());
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(50, 50, 152, 25);
		panelFimCompra.add(lblTotal);
		
		JLabel lblPrazoEntrega = new JLabel("Prazo entrega: 10 dias \u00FAteis");
		lblPrazoEntrega.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrazoEntrega.setBounds(50, 100, 270, 25);
		panelFimCompra.add(lblPrazoEntrega);
		
		JButton btnCompra = new JButton("Comprar");
		btnCompra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCompra.setBounds(100, 150, 130, 32);
		panelFimCompra.add(btnCompra);
		
		JLabel lblMonster = new JLabel("MONSTER");
		lblMonster.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMonster.setBounds(0, 0, 193, 49);
		contentPane.add(lblMonster);
		panelFimCompra.setVisible(false);

		btnColocarimagemLupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaPesquisa f = new TelaPesquisa(txtPesquisa.getText());
				f.setVisible(true);
			}
		});

		btnMeuCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaCarrinho f = new TelaCarrinho();
				f.setVisible(true);
			}
		});
		
		btnPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Placa de V�deo");
				f.setVisible(true);
			}
		});
		
		btnProcessador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Processador");
				f.setVisible(true);
			}
		});
		
		btnHddSsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("HDD/SSD");
				f.setVisible(true);
			}
		});
		
		btnMemoriaRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Mem�ria RAM");
				f.setVisible(true);
			}
		});
		
		btnPerifericos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Perif�ricos");
				f.setVisible(true);
			}
		});
		
		// ADICIONA_OS_PRODUTOS----------------------------------------------------------------------------------------------------------------------
		int cont = 0;
		for (int i = 0; i < Dados.arrayProdutos.size(); i++) {
			try {
			JLabel imagem = new JLabel(Dados.arrayCompras.get(i).getFotoCompra());
			imagem.setBounds(10, (cont * 150), 120, 120);
			panel.add(imagem);
			JLabel nome = new JLabel(Dados.arrayCompras.get(i).getNomeCompra());
			nome.setBounds(150, (cont * 150) + 50, 300, 30);
			panel.add(nome);
			JLabel valor = new JLabel("R$" + Dados.arrayCompras.get(i).getValorCompra());
			valor.setBounds(400, (cont * 150) + 50, 150, 30);
			panel.add(valor);
			JLabel qnt = new JLabel("Unidades: "+Dados.arrayCompras.get(i).getQuantidadeCompra());
			qnt.setBounds(470, (cont * 150) + 50, 300, 30);
			panel.add(qnt);
			JButton botao = new JButton("Remover");
			botao.setActionCommand(""+i);
			botao.setBounds(550, (cont * 150) + 50, 150, 30);
			panel.add(botao);
			botao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Dados.arrayCompras.remove(Integer.parseInt(botao.getActionCommand()));
					setVisible(false);
					TelaCarrinho f = new TelaCarrinho();
					f.setVisible(true);
				}
			});
			cont++;
			}
			catch(Exception b) {
				
			}
		}
		
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
		
		btnDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dados.arrayCompras.clear();
				setVisible(false);
				TelaLogin f = new TelaLogin();
				f.setVisible(true);
			}
		});
		
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				panelFimCompra.setVisible(true);
				btnFinalizarCompra.setVisible(false);
			}
		});
		
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.ControleEstoque();
				JOptionPane.showMessageDialog(null, "Obrigado por comprar na MONSTER Inform�tica");
				Dados.arrayCompras.clear();
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});
	}
}
