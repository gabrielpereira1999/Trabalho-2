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
import javax.swing.JOptionPane;
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

import acao.Acao;
import beans.Compras;
import dados.Dados;
import telaAdm.TelaAdministrador;
import telaCarrinho.TelaCarrinho;
import telaContaUsuario.TelaContaUsuario;
import telaHomePage.TelaHomePage;
import telaLogin.TelaLogin;
import telaPesquisa.TelaPesquisa;
import telaProdutoDpt.TelaProdutoDpt;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaUmProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JLabel lblValor;
	private int i;

	public TelaUmProduto(String prod) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Acao a = new Acao();
		
		JLabel lblNomeUmProduto = new JLabel();

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

		

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBackground(new Color(107, 142, 35));
		btnComprar.setForeground(new Color(240, 248, 255));
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComprar.setBounds(619, 401, 102, 30);
		contentPane.add(btnComprar);

		// Cria ícone para botão carrinho--------------------------------------------------------------------------------------------------
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
		
		//Cria ícone para botão facebook-------------------------------------------------------------------------------------------------------
		ImageIcon icon1 = new ImageIcon(TelaUmProduto.class.getResource("facebook.jpg"));
		Image temp1 = icon1.getImage();
		Image newimg1 = temp1.getScaledInstance(180, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon imagemFace = new ImageIcon(newimg1);
		
		JButton btnFacebook = new JButton(imagemFace);
		btnFacebook.setForeground(Color.WHITE);
		btnFacebook.setBackground(Color.BLUE);
		btnFacebook.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFacebook.setBounds(10, 515, 180, 40);
		contentPane.add(btnFacebook);
		
		//Cria ícone para botão instagram
		ImageIcon icon2 = new ImageIcon(TelaUmProduto.class.getResource("instagram.jpg"));
		Image temp2 = icon2.getImage();
		Image newimg2 = temp2.getScaledInstance(180, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon imagemInsta = new ImageIcon(newimg2);
		
		JButton btnInstagran = new JButton(imagemInsta);
		btnInstagran.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInstagran.setBounds(200, 515, 180, 40);
		contentPane.add(btnInstagran);
		
		//Cria ícone para botão pesquisa
		ImageIcon icon3 = new ImageIcon(TelaUmProduto.class.getResource("Twitter.jpg"));
		Image temp3 = icon3.getImage();
		Image newimg3 = temp3.getScaledInstance(180, 40, java.awt.Image.SCALE_SMOOTH);
		ImageIcon imagemTwitter = new ImageIcon(newimg3);
		
		JButton btnTwitter = new JButton(imagemTwitter);
		btnTwitter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTwitter.setBounds(390, 515, 180, 40);
		contentPane.add(btnTwitter);
		
		JButton btnWwwmonsterinformaticacom = new JButton("www.mi.com");
		btnWwwmonsterinformaticacom.setForeground(Color.WHITE);
		btnWwwmonsterinformaticacom.setBackground(Color.BLACK);
		btnWwwmonsterinformaticacom.setHorizontalAlignment(SwingConstants.LEFT);
		btnWwwmonsterinformaticacom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWwwmonsterinformaticacom.setBounds(580, 515, 180, 40);
		contentPane.add(btnWwwmonsterinformaticacom);
		
		for(i = 0;i<Dados.arrayProdutos.size();i++  ) {
			if( Dados.arrayProdutos.get(i).getProduto().equals(prod) ) {
				JLabel lblTemp = new JLabel();
				lblTemp.setBounds(10, 213, 250, 250);
				try {
				ImageIcon fotinho = new ImageIcon(Dados.arrayProdutos.get(i).getFoto().getImage()
						.getScaledInstance(lblTemp.getWidth(), lblTemp.getHeight(), java.awt.Image.SCALE_SMOOTH));

				JLabel lblImagemUmProduto = new JLabel(fotinho);
				lblImagemUmProduto.setBounds(10, 181, 250, 250);
				contentPane.add(lblImagemUmProduto);
				}catch(Exception b) {
					
				}

				lblNomeUmProduto.setText(Dados.arrayProdutos.get(i).getProduto());
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
				lblQuantidadeInt.setText("" + Dados.arrayProdutos.get(i).getQuantidade());
				lblQuantidadeInt.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblQuantidadeInt.setBounds(558, 379, 62, 22);
				contentPane.add(lblQuantidadeInt);
				
				JScrollPane SPdescricaoUmProduto = new JScrollPane();
				SPdescricaoUmProduto.setBounds(281, 230, 476, 138);
				contentPane.add(SPdescricaoUmProduto);

				JTextArea txtDescricaoUm = new JTextArea(Dados.arrayProdutos.get(i).getDescricao());
				SPdescricaoUmProduto.setViewportView(txtDescricaoUm);
				txtDescricaoUm.setLineWrap(true);
				lblValor = new JLabel("Valor:                                              R$");
				lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblValor.setBounds(280, 401, 340, 30);
				lblValor.setBorder(BorderFactory.createLineBorder(Color.black));
				contentPane.add(lblValor);
				double valor = Dados.arrayProdutos.get(i).getValor()
						* (Integer.parseInt(spinner.getValue().toString()));
				lblValor.setText("Valor:                                              R$" + valor);
				break;
			}
		}	

		JComponent comp = spinner.getEditor();
		JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
		DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
		formatter.setCommitsOnValidEdit(true);
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {

				double valor = Dados.arrayProdutos.get(i).getValor()
						* (Integer.parseInt(spinner.getValue().toString()));
				lblValor.setText("Valor:                                              R$" + valor);

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
		
		btnFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Página em desenvolvimento");
			}
		});
		
		btnWwwmonsterinformaticacom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Página em desenvolvimento");
			}
		});
		
		btnInstagran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Página em desenvolvimento");
			}
		});
		
		btnTwitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Página em desenvolvimento");
			}
		});
		
		btnMinhaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Dados.userLogado.equals("admin")) {
					setVisible(false);
					TelaAdministrador f = new TelaAdministrador();
					f.setVisible(true);
				} else {
					setVisible(false);
					TelaContaUsuario f = new TelaContaUsuario();
					f.setVisible(true);
				}
			}
		});
		
		btnPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Placa de Vídeo");
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
				TelaProdutoDpt f = new TelaProdutoDpt("Memória RAM");
				f.setVisible(true);
			}
		});
		
		btnPerifericos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaProdutoDpt f = new TelaProdutoDpt("Periféricos");
				f.setVisible(true);
			}
		});
		
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
		
		btnCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				for(int i = 0; i < Dados.arrayProdutos.size();i++) {
					if(lblNomeUmProduto.getText().equals(Dados.arrayProdutos.get(i).getProduto())) {
						Compras obj = new Compras();
						obj.setNomeCompra(Dados.arrayProdutos.get(i).getProduto());
						obj.setValorCompra(Dados.arrayProdutos.get(i).getValor()* Integer.parseInt((spinner.getValue().toString())));
						obj.setQuantidadeCompra(Integer.parseInt((spinner.getValue().toString())));
						obj.setFotoCompra(Dados.arrayProdutos.get(i).getFoto());
						a.TotalCompra(obj.getValorCompra());
						Dados.arrayCompras.add(obj);
						setVisible(false);
						TelaHomePage f = new TelaHomePage();
						f.setVisible(true);
					}
				}
				
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
		
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				for(int i = 0; i < Dados.arrayProdutos.size();i++) {
					if(lblNomeUmProduto.getText().equals(Dados.arrayProdutos.get(i).getProduto())) {
						Compras obj = new Compras();
						obj.setNomeCompra(Dados.arrayProdutos.get(i).getProduto());
						obj.setValorCompra(Dados.arrayProdutos.get(i).getValor()* Integer.parseInt((spinner.getValue().toString())));
						obj.setQuantidadeCompra(Integer.parseInt((spinner.getValue().toString())));
						obj.setFotoCompra(Dados.arrayProdutos.get(i).getFoto());
						a.TotalCompra(obj.getValorCompra());
						Dados.arrayCompras.add(obj);
						setVisible(false);
						TelaCarrinho f = new TelaCarrinho();
						f.setVisible(true);
					}
				}
				
			}
		});
		
	}
}
