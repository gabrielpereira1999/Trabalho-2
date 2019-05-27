package beans;

import javax.swing.ImageIcon;

public class Compras {
	String nomeCompra;
	int quantidadeCompra;
	double ValorCompra;
	
	ImageIcon fotoCompra;
	
	public ImageIcon getFotoCompra() {
		return fotoCompra;
	}
	public void setFotoCompra(ImageIcon fotoCompra) {
		this.fotoCompra = fotoCompra;
	}
	public String getNomeCompra() {
		return nomeCompra;
	}
	public void setNomeCompra(String nomeCompra) {
		this.nomeCompra = nomeCompra;
	}
	public int getQuantidadeCompra() {
		return quantidadeCompra;
	}
	public void setQuantidadeCompra(int quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}
	public double getValorCompra() {
		return ValorCompra;
	}
	public void setValorCompra(double valorCompra) {
		ValorCompra = valorCompra;
	}
	
}
