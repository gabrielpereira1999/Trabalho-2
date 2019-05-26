package principal;

import acao.Acao;
import telaAdm.TelaAdministrador;
import telaCriaConta.TelaCriaConta;
import telaHomePage.TelaHomePage;
import telaLogin.TelaLogin;
import telaProdutoDpt.TelaProdutoDpt;

public class Principal {

	public static void main(String[] args) {
		
		//Cria produtos padrao e login adm
		Acao a = new Acao();
		a.criaProdutos();
		
		
		//TelaLogin f = new TelaLogin();
		//TelaHomePage f = new TelaHomePage();
		//TelaAdministrador f = new TelaAdministrador();
		//TelaProdutoDpt f = new TelaProdutoDpt("Processador");
		TelaCriaConta f = new TelaCriaConta();
		f.setVisible(true);

	}

}
