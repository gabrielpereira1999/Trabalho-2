package acao;

import javax.swing.table.DefaultTableModel;

import beans.Produtos;
import beans.Produtos;
import dados.Dados;

public class Acao {

	// Cadastrar Produtos
	public void cadastrarProdutos(Produtos p) {
		Dados.arrayProdutos.add(p);
	}

	// Alterar Produtos
	private void alterarProdutos(int indice) {

		// Obter dados da Produtos selecionada
		String produto = Dados.arrayProdutos.get(indice).getProduto();
		String departamento = Dados.arrayProdutos.get(indice).getDepartamento();
		String descricao = Dados.arrayProdutos.get(indice).getDescricao();
		int quantidade = Dados.arrayProdutos.get(indice).getQuantidade();
		double valor = Dados.arrayProdutos.get(indice).getValor();
		quantidade++;

		// Criar um objeto da classe Produtos com os dados atualizados
		Produtos p = new Produtos();
		p.setProduto(produto);
		p.setQuantidade(quantidade);
		p.setValor(valor);
		p.setDepartamento(departamento);
		p.setDescricao(descricao);

		Dados.arrayProdutos.set(indice, p);
	}
	// Selecionar Produtoss
	public DefaultTableModel selecionarProdutos() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produtos");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor");
		modelo.addColumn("Departamento");
		modelo.addColumn("Descrição");

		for (int i = 0; i < Dados.arrayProdutos.size(); i++) {
			modelo.addRow(new Object[] { Dados.arrayProdutos.get(i).getProduto(),
					Dados.arrayProdutos.get(i).getQuantidade(),
					Dados.arrayProdutos.get(i).getValor(),
					Dados.arrayProdutos.get(i).getDepartamento(),
					Dados.arrayProdutos.get(i).getDescricao()});
		}

		return modelo;

	}

	
}
