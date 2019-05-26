package telaUmProduto;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter;

import dados.Dados;
import telaHomePage.TelaHomePage;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class TelaUmProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;

	public TelaUmProduto() {
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

		// Cria ícone para botão pesquisa
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

		JLabel lblTemp = new JLabel();
		lblTemp.setBounds(10, 213, 250, 250);

		ImageIcon fotinho = new ImageIcon(Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getFoto().getImage()
				.getScaledInstance(lblTemp.getWidth(), lblTemp.getHeight(), java.awt.Image.SCALE_SMOOTH));

		JLabel lblImagemUmProduto = new JLabel(fotinho);
		lblImagemUmProduto.setBounds(10, 181, 250, 250);
		contentPane.add(lblImagemUmProduto);

		JLabel lblNomeUmProduto = new JLabel(Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getProduto());
		lblNomeUmProduto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeUmProduto.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNomeUmProduto.setBounds(270, 183, 490, 49);
		contentPane.add(lblNomeUmProduto);

		JLabel lblQuantidadeDisponivel = new JLabel("Quantidade Disponivel:");
		lblQuantidadeDisponivel.setBorder(BorderFactory.createLineBorder(Color.black));
		lblQuantidadeDisponivel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidadeDisponivel.setBounds(280, 379, 340, 22);
		contentPane.add(lblQuantidadeDisponivel);

		JLabel lblQuantidadeInt = new JLabel("");
		lblQuantidadeInt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidadeInt.setText("" + Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getQuantidade() + " ");
		lblQuantidadeInt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidadeInt.setBounds(558, 379, 62, 22);
		contentPane.add(lblQuantidadeInt);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBackground(new Color(107, 142, 35));
		btnComprar.setForeground(new Color(240, 248, 255));
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComprar.setBounds(619, 401, 102, 30);
		contentPane.add(btnComprar);

		// Cria ícone para botão carrinho
		ImageIcon iconCarrinho = new ImageIcon(TelaUmProduto.class.getResource("carrinhodecompras.png"));
		Image carrinho = iconCarrinho.getImage();
		Image carrinho2 = carrinho.getScaledInstance(36, 32, java.awt.Image.SCALE_SMOOTH);
		ImageIcon carrinho3 = new ImageIcon(carrinho2);

		JButton btnCarrinho = new JButton(carrinho3);
		btnCarrinho.setBackground(new Color(107, 142, 35));
		btnCarrinho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCarrinho.setBounds(721, 401, 36, 30);
		contentPane.add(btnCarrinho);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setToolTipText("");
		spinner.setBounds(619, 379, 138, 22);
		spinner.setBorder(BorderFactory.createLineBorder(Color.black));
		spinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		contentPane.add(spinner);

		JLabel lblValor = new JLabel("Valor:                                              R$");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(280, 401, 340, 30);
		lblValor.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblValor);
		double valor = Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getValor()
				* (Integer.parseInt(spinner.getValue().toString()));
		lblValor.setText("Valor:                                              R$" + valor);

		JComponent comp = spinner.getEditor();
		JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
		DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
		formatter.setCommitsOnValidEdit(true);
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {

				double valor = Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getValor()
						* (Integer.parseInt(spinner.getValue().toString()));
				lblValor.setText("Valor:                                              R$" + valor);

			}
		});

		JScrollPane SPdescricaoUmProduto = new JScrollPane();
		SPdescricaoUmProduto.setBounds(281, 230, 476, 138);
		contentPane.add(SPdescricaoUmProduto);

		JTextArea txtDescricaoUm = new JTextArea(Dados.arrayProdutos.get(TelaHomePage.numeroProduto).getDescricao());
		SPdescricaoUmProduto.setViewportView(txtDescricaoUm);
		txtDescricaoUm.setLineWrap(true);
		
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
