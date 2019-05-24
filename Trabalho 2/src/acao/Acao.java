package acao;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import beans.Produtos;
import dados.Dados;

public class Acao {

	// Cadastrar Produtos
	public void cadastrarProdutos(Produtos p) {
		Dados.arrayProdutos.add(p);
	}

	// Alterar Produtos
	public void alterarProdutos(Produtos p, int i) {

		Dados.arrayProdutos.set(i, p);
	}

	// Selecionar Produtos
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

	// Selecionar imagem
	public Image selecionaImagem() {
		JFileChooser fc = new JFileChooser();
		fc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and JPG", "png", "jpg");
		fc.addChoosableFileFilter(filter);
		int aux = fc.showDialog(null,"Escolher imagem");
		if(aux == fc.APPROVE_OPTION) {
			File imagemEscolhida = new File(fc.getSelectedFile().getPath()); 
			try {
				Image imagem = ImageIO.read(imagemEscolhida);
				Image newimg = imagem.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); //Definir tamanho----------------------------------
				return newimg;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		Image imagem = null;
		return imagem;
		
	}

}
