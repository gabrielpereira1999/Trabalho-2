package principal;

import acao.Acao;
import telaAdm.TelaAdministrador;
import telaHomePage.TelaHomePage;
import telaLogin.TelaLogin;
import telaProdutoDpt.TelaProdutoDpt;

public class Principal {

	public static void main(String[] args) {
		
		Acao a = new Acao();
		a.criaProdutos();
		//Cria produtos padrao
		
		
		//TelaLogin f = new TelaLogin();
		//TelaHomePage f = new TelaHomePage();
		//TelaAdministrador f = new TelaAdministrador();
		TelaProdutoDpt f = new TelaProdutoDpt();
		f.setVisible(true);

	}

}
