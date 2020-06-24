package expressõesAritméticasBanco;

public class MainAppBanco {

	public static void main(String[] args) {

		ServicoBancoDeDados servico = new ServicoBancoDeDados();

		Banco bancosSantander = new BancoSantander();

		bancosSantander.setServidor(servico);

		Banco bancosBrasil = new BancoBrasil();
		bancosBrasil.setServidor(servico);

		servico.getBancos().add(bancosSantander);
		servico.getBancos().add(bancosBrasil);

		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();

		// pobre
		p1.setIdPessoa(1);
		p1.setCpf("431.345.123-23");
		p1.setDinheiro(23.44);
		p1.setNome("Alfonso");
		p1.setBanco(bancosSantander);
		bancosSantander.getPessoa().add(p1);
		p1.setNumeroCC(214);

		// rico
		p2.setIdPessoa(1);
		p2.setBanco(bancosBrasil);
		p2.setCpf("321.323.123-23");
		p2.setNome("Kenan");
		p2.setDinheiro(32333.2);
		bancosBrasil.getPessoa().add(p2);
		p2.setNumeroCC(114);

		System.out.println(bancosSantander.getPessoa().size());// Exibi a saida da quantidade de pessoas d banco
																// santander
		System.out.print(bancosBrasil.getPessoa().size());// Exibi a saida da quantidade de pessoas d banco
		// brasil

		// transferir quantia de dinheiro p1 e p1
		// Vai exibir uma caixa de texto para voce digitar
		// voce é p1 e tem a quantia p1.getDinheiro()= 23.44
		// digite a quantia que voce quer realizar
		bancosSantander.transferir(21.00, 231, 114, p1);
		System.out.println("Valor de p2 " + p1.getDinheiro());
	}

}
