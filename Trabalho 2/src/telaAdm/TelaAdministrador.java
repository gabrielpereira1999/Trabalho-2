package telaAdm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Produtos;
import jdk.nashorn.api.tree.TryTree;

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
	protected static JTable tableProdutos;
	@SuppressWarnings("rawtypes")
	protected JComboBox comboDepartamento = new JComboBox();
	protected JTextArea txtDescricao = new JTextArea();
	protected JSpinner spinnerQuantidade = new JSpinner();
	protected ImageIcon imagem;

	public void limparCampos() {

		// Limpar campos
		txtDescricao.setText("");
		txtProduto.setText("");
		txtValor.setText("");
		comboDepartamento.setSelectedIndex(0);
		spinnerQuantidade.setValue(0);

	}

	public TelaAdministrador() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Acao a = new Acao();

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(10, 21, 57, 19);
		contentPane.add(lblProduto);

		txtProduto = new JTextField();
		txtProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtProduto.setBounds(10, 44, 150, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(198, 21, 57, 19);
		contentPane.add(lblValor);

		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtValor.setColumns(10);
		txtValor.setBounds(198, 44, 75, 20);
		contentPane.add(txtValor);

		lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDepartamento.setBounds(10, 84, 103, 19);
		contentPane.add(lblDepartamento);

		comboDepartamento.setBounds(10, 114, 150, 20);
		contentPane.add(comboDepartamento);
		
		comboDepartamento.addItem("Placa de Vídeo");
		comboDepartamento.addItem("Processador");
		comboDepartamento.addItem("HDD/SSD");
		comboDepartamento.addItem("Memória RAM");
		comboDepartamento.addItem("Periféricos");

		JSpinner spinnerQuantidade = new JSpinner();
		spinnerQuantidade.setBounds(198, 114, 75, 20);
		contentPane.add(spinnerQuantidade);
		spinnerQuantidade.setModel(new SpinnerNumberModel(0, 0, 100, 1));

		lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidade.setBounds(198, 88, 83, 19);
		contentPane.add(lblQuantidade);

		lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescrio.setBounds(10, 156, 88, 19);
		contentPane.add(lblDescrio);

		JScrollPane scrollPaneDescricao = new JScrollPane();
		scrollPaneDescricao.setBounds(10, 186, 263, 162);
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

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastrar.setBounds(10, 359, 175, 25);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAlterar.setBounds(195, 359, 175, 25);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(380, 359, 175, 25);
		contentPane.add(btnExcluir);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setEnabled(false);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(565, 359, 175, 25);
		contentPane.add(btnCancelar);

		JButton btnEscolherImagem = new JButton("Escolher Imagem");
		btnEscolherImagem.setBounds(137, 156, 136, 23);
		contentPane.add(btnEscolherImagem);

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
				btnCancelar.setEnabled(true);

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
				
			}catch (Exception caractere) {
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
			}catch (Exception caractere) {
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

				// Limpar campos
				limparCampos();
			}
		});
		// CADASTRO-------------------------------------------------------------------------------------------------------------------------------------------------------
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Instânciar obj
				Produtos p = new Produtos();
				p.setProduto(txtProduto.getText());
				p.setQuantidade(Integer.parseInt(spinnerQuantidade.getValue().toString()));
				p.setValor(Double.parseDouble(txtValor.getText()));
				p.setDepartamento(comboDepartamento.getSelectedItem().toString());
				p.setDescricao(txtDescricao.getText());
				p.setFoto(imagem);

				a.cadastrarProdutos(p);

				// Atualizar
				tableProdutos.setModel(a.selecionarProdutos());

				// Limpar campos
				limparCampos();
			}
		});

		btnEscolherImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imagem = a.selecionaImagem();
			}
		});

	}
}
