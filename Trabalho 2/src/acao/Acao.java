package acao;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import beans.Produtos;
import dados.Dados;

public class Acao {

	// CADASTRAR_PRODUTOS
	public void cadastrarProdutos(Produtos p) {
		for(int i = 0;i<Dados.arrayProdutos.size();i++){
			if(Dados.arrayProdutos.get(i).getProduto().equals(p.getProduto())) {
				JOptionPane.showMessageDialog(null, "Um produto com este nome já foi cadastrado");
				return;
			}
		}

		Dados.arrayProdutos.add(p);
	}

	// ALTERAR_PRODUTOS
	public void alterarProdutos(int i, Produtos p) {

		Dados.arrayProdutos.set(i, p);
	}

	// SSELECIONAR_PRODUTOS
	public DefaultTableModel selecionarProdutos() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produtos");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor");
		modelo.addColumn("Departamento");
		modelo.addColumn("Descrição");

		for (int i = 0; i < Dados.arrayProdutos.size(); i++) {
			modelo.addRow(new Object[] { Dados.arrayProdutos.get(i).getProduto(),
					Dados.arrayProdutos.get(i).getQuantidade(), Dados.arrayProdutos.get(i).getValor(),
					Dados.arrayProdutos.get(i).getDepartamento(), Dados.arrayProdutos.get(i).getDescricao() });
		}

		return modelo;

	}

	// SELECIONAR_IMAGEM------------------------------------------------------------------------------------------------------------------------
	public ImageIcon selecionaImagem() {
		JFileChooser fc = new JFileChooser();
		fc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and JPG", "png", "jpg");
		fc.addChoosableFileFilter(filter);
		int aux = fc.showDialog(null, "Escolher imagem");
		if (aux == fc.APPROVE_OPTION) {
			File imagemEscolhida = new File(fc.getSelectedFile().getPath());
			try {
				Image imagem = ImageIO.read(imagemEscolhida);
				Image newimg = imagem.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // DEFINIR_TAMANHO------------------------------
				ImageIcon foto = new ImageIcon(newimg);
				return foto;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		ImageIcon imagem = null;
		return imagem;

	}

	// CRIA_PRODUTOS_INICIAIS----------------------------------------------------------------------------------------------------------------------
	public void criaProdutos() {
		// PRIMEIRO_PRODUTO
		Produtos p = new Produtos();
		p.setProduto("HyperX Fury 8GB");
		p.setDepartamento("HDD/SSD");
		p.setQuantidade(100);
		p.setDescricao("Memória HyperX Fury, 8GB, 2400MHz, DDR4, CL15, Preto - HX424C15FB2/8");
		p.setValor(270);
		try {
			ImageIcon foto = new ImageIcon(ImageIO.read(Acao.class.getResource("Ram hyperx.jpg")).getScaledInstance(120,
					120, java.awt.Image.SCALE_SMOOTH));
			p.setFoto(foto);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Dados.arrayProdutos.add(p);

		// SEGUNDO_PRODUTO
		Produtos p2 = new Produtos();
		p2.setProduto("Intel Core i7-9700K");
		p2.setDepartamento("Processador");
		p2.setQuantidade(50);
		p2.setDescricao(
				"Processador Intel Core i7-9700K Coffee Lake Refresh, Cache 12MB, 3.6GHz (4.9GHz Max Turbo), LGA 1151 - BX80684I79700K");
		p2.setValor(2700);
		try {
			ImageIcon foto2 = new ImageIcon(ImageIO.read(Acao.class.getResource("I7 9700k.jpg")).getScaledInstance(120,
					120, java.awt.Image.SCALE_SMOOTH));
			p2.setFoto(foto2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Dados.arrayProdutos.add(p2);

		//TERCEIRO_PRODUTO
		Produtos p3 = new Produtos();
		p3.setProduto("Zotac NVIDIA GeForce RTX 2080 Ti");
		p3.setDepartamento("Placa de Vídeo");
		p3.setQuantidade(200);
		p3.setDescricao(
				"Placa de Vídeo VGA Zotac NVIDIA GeForce RTX 2080 Ti Triple Fan 11GB, GDDR6, 352 bits, PCI-E 3.0 - ZT-T20810F-10P");
		p3.setValor(8000);
		try {
			ImageIcon foto3 = new ImageIcon(ImageIO.read(Acao.class.getResource("RTX2080TI.jpg")).getScaledInstance(120,
					120, java.awt.Image.SCALE_SMOOTH));
			p3.setFoto(foto3);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Dados.arrayProdutos.add(p3);

	}
	
	//ATUALIZA_TELA_PRODUTO_DEPARTAMENTO--------------------------------------------------------------------------------------------------------------
	public Dimension NovaTelaProdutos(String dpt) {
		//VERIFICA_NUMERO_DE_PRODUTOS_NO_DPT
		int cont = 0;
		for(int i = 0;i<Dados.arrayProdutos.size();i++) {
			if( Dados.arrayProdutos.get(i).getDepartamento().equals(dpt) ) {
				cont++;
			}
		}
		
		Dimension dimensaoCriada = new Dimension(100,(cont*747));
		return dimensaoCriada;
	}
}
