package telaAdm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.HddSdd;
import beans.PlacaDeVideo;
import beans.Processador;
import beans.Produtos;
import beans.Ram;
import telaHomePage.TelaHomePage;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaAdministrador extends JFrame {

	private JPanel contentPane;
	protected JTextField txtProduto;
	protected JTextField txtValor;
	private JLabel lblDepartamento;
	private JLabel lblQuantidade;
	private JLabel lblDescrio;
	private JLabel lblMemoria = new JLabel("Mem\u00F3ria");
	private JLabel lblNucleos = new JLabel("N\u00FAcleos");
	private JLabel lblClock = new JLabel("Clock");
	private JLabel lblBits = new JLabel("Bits");
	private JLabel lblThreads = new JLabel("Threads");
	private JLabel lblVelWrite = new JLabel("Vel. Escrita");
	private JLabel lblVelRead = new JLabel("Vel. Leitura");
	private JLabel lblDdr = new JLabel("DDR");
	protected static JTable tableProdutos;
	@SuppressWarnings("rawtypes")
	protected JComboBox comboDepartamento = new JComboBox();
	protected JTextArea txtDescricao = new JTextArea();
	protected JSpinner spinnerQuantidade = new JSpinner();
	protected ImageIcon imagem;
	private JTextField txtMemoria;
	private JTextField txtBits;
	private JTextField txtClock;
	private JTextField txtNucleos;
	private JTextField txtThreads;
	private JTextField txtVelWrite;
	private JTextField txtVelRead;
	private JTextField txtDdr;
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnAlterar = new JButton("Alterar");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnCancelar = new JButton("Cancelar");

	public void limparCampos() {

		// Limpar campos
		txtDescricao.setText("");
		txtProduto.setText("");
		txtValor.setText("");
		comboDepartamento.setSelectedIndex(0);
		spinnerQuantidade.setValue(0);
		
		txtMemoria.setText("");
		txtBits.setText("");
		txtClock.setText("");
		txtNucleos.setText("");
		txtThreads.setText("");
		txtVelRead.setText("");
		txtVelWrite.setText("");
		txtDdr.setText("");
		//imagem.setImage(null);

		// Botões
		btnCadastrar.setEnabled(true);
		btnAlterar.setEnabled(false);
		btnExcluir.setEnabled(false);

	}

	@SuppressWarnings("unchecked")
	public TelaAdministrador() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Acao a = new Acao();
		
				txtVelRead = new JTextField();
				txtVelRead.setFont(new Font("Tahoma", Font.PLAIN, 15));
				txtVelRead.setColumns(10);
				txtVelRead.setBounds(10, 179, 150, 20);
				contentPane.add(txtVelRead);
				txtVelRead.setVisible(false);
		
		lblVelRead.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVelRead.setBounds(10, 159, 103, 19);
		contentPane.add(lblVelRead);
		lblVelRead.setVisible(false);

		lblNucleos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNucleos.setBounds(198, 105, 75, 14);
		contentPane.add(lblNucleos);

		lblClock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClock.setBounds(10, 105, 48, 14);
		contentPane.add(lblClock);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(10, 11, 57, 19);
		contentPane.add(lblProduto);

		txtProduto = new JTextField();
		txtProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtProduto.setBounds(10, 30, 150, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(198, 11, 57, 19);
		contentPane.add(lblValor);

		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtValor.setColumns(10);
		txtValor.setBounds(198, 30, 75, 20);
		contentPane.add(txtValor);

		lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDepartamento.setBounds(10, 55, 103, 19);
		contentPane.add(lblDepartamento);

		comboDepartamento.setBounds(10, 74, 150, 20);
		contentPane.add(comboDepartamento);

		comboDepartamento.addItem("Placa de Vídeo");
		comboDepartamento.addItem("Processador");
		comboDepartamento.addItem("HDD/SSD");
		comboDepartamento.addItem("Memória RAM");
		comboDepartamento.addItem("Periféricos");

		JSpinner spinnerQuantidade = new JSpinner();
		spinnerQuantidade.setBounds(198, 74, 75, 20);
		contentPane.add(spinnerQuantidade);
		spinnerQuantidade.setModel(new SpinnerNumberModel(0, 0, 100, 1));

		lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidade.setBounds(198, 55, 83, 19);
		contentPane.add(lblQuantidade);

		lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrio.setBounds(10, 210, 88, 19);
		contentPane.add(lblDescrio);

		JScrollPane scrollPaneDescricao = new JScrollPane();
		scrollPaneDescricao.setBounds(10, 240, 263, 108);
		contentPane.add(scrollPaneDescricao);

		scrollPaneDescricao.setViewportView(txtDescricao);
		txtDescricao.setLineWrap(true);

		JScrollPane scrollPaneProdutos = new JScrollPane();
		scrollPaneProdutos.setBounds(293, 21, 431, 327);
		contentPane.add(scrollPaneProdutos);

		tableProdutos = new JTable();
		tableProdutos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tableProdutos.setModel(a.selecionarProdutos());
		scrollPaneProdutos.setViewportView(tableProdutos);

		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastrar.setBounds(10, 359, 130, 25);
		contentPane.add(btnCadastrar);

		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlterar.setBounds(161, 359, 130, 25);
		contentPane.add(btnAlterar);

		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(314, 359, 130, 25);
		contentPane.add(btnExcluir);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(467, 359, 130, 25);
		contentPane.add(btnCancelar);

		JButton btnEscolherImagem = new JButton("Escolher Imagem");
		btnEscolherImagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEscolherImagem.setBounds(123, 208, 150, 23);
		contentPane.add(btnEscolherImagem);

		lblMemoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMemoria.setBounds(10, 103, 103, 19);
		contentPane.add(lblMemoria);

		txtMemoria = new JTextField();
		txtMemoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMemoria.setColumns(10);
		txtMemoria.setBounds(10, 130, 150, 20);
		contentPane.add(txtMemoria);

		lblBits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBits.setBounds(198, 103, 57, 19);
		contentPane.add(lblBits);

		txtBits = new JTextField();
		txtBits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBits.setColumns(10);
		txtBits.setBounds(198, 130, 75, 20);
		contentPane.add(txtBits);

		txtClock = new JTextField();
		txtClock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtClock.setColumns(10);
		txtClock.setBounds(10, 130, 150, 20);
		contentPane.add(txtClock);

		txtNucleos = new JTextField();
		txtNucleos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNucleos.setColumns(10);
		txtNucleos.setBounds(198, 130, 75, 20);
		contentPane.add(txtNucleos);

		lblThreads.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblThreads.setBounds(10, 161, 57, 14);
		contentPane.add(lblThreads);

		txtThreads = new JTextField();
		txtThreads.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtThreads.setColumns(10);
		txtThreads.setBounds(10, 179, 150, 20);
		contentPane.add(txtThreads);
		
		lblVelWrite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVelWrite.setBounds(10, 103, 103, 19);
		contentPane.add(lblVelWrite);

		txtVelWrite = new JTextField();
		txtVelWrite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtVelWrite.setColumns(10);
		txtVelWrite.setBounds(10, 130, 150, 20);
		contentPane.add(txtVelWrite);
		
		lblDdr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDdr.setBounds(198, 103, 57, 19);
		contentPane.add(lblDdr);

		txtDdr = new JTextField();
		txtDdr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDdr.setColumns(10);
		txtDdr.setBounds(198, 130, 75, 20);
		contentPane.add(txtDdr);
		
		JButton btnHomepage = new JButton("HomePage");
		btnHomepage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHomepage.setBounds(607, 359, 130, 25);
		contentPane.add(btnHomepage);

		txtMemoria.setVisible(true);
		txtBits.setVisible(true);
		lblMemoria.setVisible(true);
		lblBits.setVisible(true);
		txtClock.setVisible(false);
		txtNucleos.setVisible(false);
		txtThreads.setVisible(false);
		lblClock.setVisible(false);
		lblNucleos.setVisible(false);
		lblThreads.setVisible(false);
		lblVelWrite.setVisible(false);
		txtVelWrite.setVisible(false);
		lblDdr.setVisible(false);
		txtDdr.setVisible(false);

		tableProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// Obter o indice da tabela
				int indice = tableProdutos.getSelectedRow();

				// Selecionando dados do curso
				txtProduto.setText(tableProdutos.getValueAt(indice, 0).toString());
				spinnerQuantidade.setValue(tableProdutos.getValueAt(indice, 1));
				txtValor.setText(tableProdutos.getValueAt(indice, 2).toString());
				comboDepartamento.setSelectedItem(tableProdutos.getValueAt(indice, 3).toString());
				txtDescricao.setText(tableProdutos.getValueAt(indice, 4).toString());

				// Botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);

			}

		});

		txtValor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				try {

					// Converter caractere em ASCII
					int caractere = (int) e.getKeyChar();

					if (caractere != 8) {

						// Obter o valor digitado
						String texto = txtValor.getText();

						// Validar caractere
						if (caractere < 48 || caractere > 57) {
							txtValor.setText(texto.substring(0, texto.length() - 1));
						}

					}

				} catch (Exception caractere) {
					// TODO: handle exception
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {

				try {

					// Converter caractere em ASCII
					int caractere = (int) e.getKeyChar();

					if (caractere != 8) {

						// Obter o valor digitado
						String texto = txtValor.getText();

						// Validar caractere
						if (caractere < 48 || caractere > 57) {
							txtValor.setText(texto.substring(0, texto.length() - 1));
						}

					}
				} catch (Exception caractere) {
					// TODO: handle exception
				}

			}
		});

		// REALIZAR_ALTERAÇÃO---------------------------------------------------------------------------------------------------------------------------------------------
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Instânciar obj
				Produtos p = new Produtos();
				p.setProduto(txtProduto.getText());
				p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
				p.setValor(Double.parseDouble(txtValor.getText()));
				p.setDepartamento(comboDepartamento.getSelectedItem().toString());
				p.setDescricao(txtDescricao.getText());
				int i = tableProdutos.getSelectedRow();

				a.alterarProdutos(i, p);
				tableProdutos.setModel(a.selecionarProdutos());

				// Limpar campos
				limparCampos();
			}
		});
		// CADASTRO-------------------------------------------------------------------------------------------------------------------------------------------------------
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboDepartamento.getSelectedIndex() == 0) { // PLACA_DE_VÍDEO---------------------------------------------
					// Instânciar_obj
					PlacaDeVideo p = new PlacaDeVideo();
					p.setProduto(txtProduto.getText());
					p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
					p.setValor(Double.parseDouble(txtValor.getText()));
					p.setDepartamento(comboDepartamento.getSelectedItem().toString());
					p.setDescricao(txtDescricao.getText());
					p.setFoto(imagem);
					p.setBits(Integer.parseInt(txtBits.getText()));
					p.setMemoria(txtMemoria.getText());
					a.cadastrarProdutos(p);
				}else if (comboDepartamento.getSelectedIndex() == 1) { // PROCESSADOR------------------------------------------
					// Instânciar_obj
					Processador p = new Processador();
					p.setProduto(txtProduto.getText());
					p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
					p.setValor(Double.parseDouble(txtValor.getText()));
					p.setDepartamento(comboDepartamento.getSelectedItem().toString());
					p.setDescricao(txtDescricao.getText());
					p.setFoto(imagem);
					p.setClock(txtClock.getText());
					p.setNucleo(Integer.parseInt(txtNucleos.getText()));
					p.setThread(Integer.parseInt(txtThreads.getText()));
					a.cadastrarProdutos(p);
				}else if (comboDepartamento.getSelectedIndex() == 2) { // HDD/SDD----------------------------------------------
					// Instânciar_obj
					HddSdd p = new HddSdd();
					p.setProduto(txtProduto.getText());
					p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
					p.setValor(Double.parseDouble(txtValor.getText()));
					p.setDepartamento(comboDepartamento.getSelectedItem().toString());
					p.setDescricao(txtDescricao.getText());
					p.setFoto(imagem);
					p.setVelRead(Integer.parseInt(txtVelRead.getText()));
					p.setVelWrite(Integer.parseInt(txtVelWrite.getText()));
					a.cadastrarProdutos(p);
				}else if (comboDepartamento.getSelectedIndex() == 3) { // MEMÓRIA_RAM------------------------------------------
					// Instânciar_obj
					Ram p = new Ram();
					p.setProduto(txtProduto.getText());
					p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
					p.setValor(Double.parseDouble(txtValor.getText()));
					p.setDepartamento(comboDepartamento.getSelectedItem().toString());
					p.setDescricao(txtDescricao.getText());
					p.setFoto(imagem);
					p.setMemoria(Integer.parseInt(txtMemoria.getText()));
					p.setDdr(Integer.parseInt(txtDdr.getText()));
					a.cadastrarProdutos(p);
				}else { //PERIFÉRICO-----------------------------------------------------------------------------------------------------------
					Produtos p = new Produtos();
					p.setProduto(txtProduto.getText());
					p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
					p.setValor(Double.parseDouble(txtValor.getText()));
					p.setDepartamento(comboDepartamento.getSelectedItem().toString());
					p.setDescricao(txtDescricao.getText());
					p.setFoto(imagem);
					a.cadastrarProdutos(p);
				}

				// Atualizar
				tableProdutos.setModel(a.selecionarProdutos());

				// Limpar campos
				limparCampos();
			}
		});

		// ESCOLHE_IMAGEM_PRODUTO---------------------------------------------------------------------------------------------------------------------
		btnEscolherImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imagem = a.selecionaImagem();
			}
		});

		// OBSERVA_SELEÇÃO_DPT_PARA_AJUSTAR_DADOS
		comboDepartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboDepartamento.getSelectedIndex() == 0) {
					txtMemoria.setVisible(true);
					txtBits.setVisible(true);
					lblMemoria.setVisible(true);
					lblBits.setVisible(true);
					txtClock.setVisible(false);
					txtNucleos.setVisible(false);
					txtThreads.setVisible(false);
					lblClock.setVisible(false);
					lblNucleos.setVisible(false);
					lblThreads.setVisible(false);
					lblVelRead.setVisible(false);
					lblVelWrite.setVisible(false);
					txtVelRead.setVisible(false);
					txtVelWrite.setVisible(false);
					lblDdr.setVisible(false);
					txtDdr.setVisible(false);
				} else if (comboDepartamento.getSelectedIndex() == 1) {
					txtMemoria.setVisible(false);
					txtBits.setVisible(false);
					lblMemoria.setVisible(false);
					lblBits.setVisible(false);
					txtClock.setVisible(true);
					txtNucleos.setVisible(true);
					txtThreads.setVisible(true);
					lblClock.setVisible(true);
					lblNucleos.setVisible(true);
					lblThreads.setVisible(true);
					lblVelRead.setVisible(false);
					lblVelWrite.setVisible(false);
					txtVelRead.setVisible(false);
					txtVelWrite.setVisible(false);
					lblDdr.setVisible(false);
					txtDdr.setVisible(false);
				} else if (comboDepartamento.getSelectedIndex() == 2) {
					txtMemoria.setVisible(false);
					txtBits.setVisible(false);
					lblMemoria.setVisible(false);
					lblBits.setVisible(false);
					txtClock.setVisible(false);
					txtNucleos.setVisible(false);
					txtThreads.setVisible(false);
					lblClock.setVisible(false);
					lblNucleos.setVisible(false);
					lblThreads.setVisible(false);
					lblVelRead.setVisible(true);
					lblVelWrite.setVisible(true);
					txtVelRead.setVisible(true);
					txtVelWrite.setVisible(true);
					lblDdr.setVisible(false);
					txtDdr.setVisible(false);
				} else if (comboDepartamento.getSelectedIndex() == 3) {
					txtMemoria.setVisible(true);
					txtBits.setVisible(false);
					lblMemoria.setVisible(true);
					lblBits.setVisible(false);
					txtClock.setVisible(false);
					txtNucleos.setVisible(false);
					txtThreads.setVisible(false);
					lblClock.setVisible(false);
					lblNucleos.setVisible(false);
					lblThreads.setVisible(false);
					lblVelRead.setVisible(false);
					lblVelWrite.setVisible(false);
					txtVelRead.setVisible(false);
					txtVelWrite.setVisible(false);
					lblDdr.setVisible(true);
					txtDdr.setVisible(true);
				}else if (comboDepartamento.getSelectedIndex() == 4) {
					txtMemoria.setVisible(false);
					txtBits.setVisible(false);
					lblMemoria.setVisible(false);
					lblBits.setVisible(false);
					txtClock.setVisible(false);
					txtNucleos.setVisible(false);
					txtThreads.setVisible(false);
					lblClock.setVisible(false);
					lblNucleos.setVisible(false);
					lblThreads.setVisible(false);
					lblVelRead.setVisible(false);
					lblVelWrite.setVisible(false);
					txtVelRead.setVisible(false);
					txtVelWrite.setVisible(false);
					lblDdr.setVisible(false);
					txtDdr.setVisible(false);
				}
			}
		});

		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = tableProdutos.getSelectedRow();
				a.ExcluirProduto(i);
				tableProdutos.setModel(a.selecionarProdutos());
				limparCampos();
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();

			}
		});
		
		btnHomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaHomePage f = new TelaHomePage();
				f.setVisible(true);
			}
		});

	}
}
