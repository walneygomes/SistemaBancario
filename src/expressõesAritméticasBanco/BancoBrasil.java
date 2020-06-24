package expressõesAritméticasBanco;

import java.util.List;

public class BancoBrasil extends Banco {
	private int numeroAgencia = 231;
	private static final double JUROS = 2.39;

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public void transferir(double valor, int agencia, int c, Pessoa pt) {
		// TODO Auto-generated method stub
		if (pt.getDinheiro() >= valor) {
			if (agencia != this.numeroAgencia) {
				System.out.print("ENTREI AQUI NA AGENCIA DIFERENTE");
				for (int i = 0; i < this.getServidor().getBancos().size(); i++) {
					if (this.getServidor().getBancos().get(i).getNumeroAgencia() == agencia) {
						for (int j = 0; j < this.getServidor().getBancos().get(i).getPessoa().size(); j++) {
							if (this.getServidor().getBancos().get(i).getPessoa().get(j).getNumeroCC() == c) {
								this.getServidor().getBancos().get(i).getPessoa().get(j).setDinheiro(
										(this.getServidor().getBancos().get(i).getPessoa().get(j).getDinheiro()
												+ (valor)));
								pt.setDinheiro((double) pt.getDinheiro() - (valor * JUROS));
							}
						}

					}

				}

			}

			else {

				for (int i = 0; i < this.getPessoa().size(); i++) {
					this.getPessoa().get(i).setDinheiro(23.00);
					this.getServidor().getBancos().get(0).getPessoa().get(0).setDinheiro(valor);
					System.out.print(this.getServidor().getBancos().get(0).getPessoa().get(0).getDinheiro());

				}

			}

		}
	}
}