package telaHomePage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaHomePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		
		//Cria ícone para botão pesquisa
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
		
		JLabel lblDestaques = new JLabel("Destaques");
		lblDestaques.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDestaques.setBounds(10, 172, 108, 30);
		contentPane.add(lblDestaques);
		
		JLabel lblImagemdoproduto = new JLabel("ImagemDoProduto");
		lblImagemdoproduto.setBounds(10, 213, 108, 106);
		contentPane.add(lblImagemdoproduto);
		
		JLabel lblNomeprodutodestaque1 = new JLabel("NomeProdutoDestaque1");
		lblNomeprodutodestaque1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque1.setBounds(143, 253, 175, 22);
		contentPane.add(lblNomeprodutodestaque1);
		
		JLabel lblValorprodutodestaque1 = new JLabel("ValorProdutoDestaque1");
		lblValorprodutodestaque1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque1.setBounds(380, 256, 163, 16);
		contentPane.add(lblValorprodutodestaque1);
		
		JLabel lblImagemdoproduto_1 = new JLabel("ImagemDoProduto2");
		lblImagemdoproduto_1.setBounds(10, 335, 108, 106);
		contentPane.add(lblImagemdoproduto_1);
		
		JLabel lblNomeprodutodestaque_1 = new JLabel("NomeProdutoDestaque2");
		lblNomeprodutodestaque_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque_1.setBounds(143, 375, 175, 22);
		contentPane.add(lblNomeprodutodestaque_1);
		
		JLabel lblValorprodutodestaque = new JLabel("ValorProdutoDestaque2");
		lblValorprodutodestaque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque.setBounds(380, 381, 163, 16);
		contentPane.add(lblValorprodutodestaque);
		
		JLabel lblImagemdoproduto3 = new JLabel("ImagemDoProduto3");
		lblImagemdoproduto3.setBounds(10, 457, 108, 106);
		contentPane.add(lblImagemdoproduto3);
		
		JLabel lblNomeprodutodestaque3 = new JLabel("NomeProdutoDestaque3");
		lblNomeprodutodestaque3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeprodutodestaque3.setBounds(143, 497, 175, 22);
		contentPane.add(lblNomeprodutodestaque3);
		
		JLabel lblValorprodutodestaque3 = new JLabel("ValorProdutoDestaque3");
		lblValorprodutodestaque3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorprodutodestaque3.setBounds(380, 500, 163, 16);
		contentPane.add(lblValorprodutodestaque3);
		
		JButton btnPaginaDoProduto = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto.setBounds(591, 253, 169, 23);
		contentPane.add(btnPaginaDoProduto);
		
		JButton btnPaginaDoProduto2 = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto2.setBounds(591, 377, 169, 23);
		contentPane.add(btnPaginaDoProduto2);
		
		JButton btnPaginaDoProduto3 = new JButton("P\u00E1gina do Produto");
		btnPaginaDoProduto3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPaginaDoProduto3.setBounds(591, 499, 169, 23);
		contentPane.add(btnPaginaDoProduto3);
	}

}
