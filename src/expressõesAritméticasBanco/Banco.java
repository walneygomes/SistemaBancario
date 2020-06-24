package expressõesAritméticasBanco;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {

	private int idBanco;
	private String cnpj;
	private String nomeDoBanco;
	private double valor;
	private ServicoBancoDeDados servidor;
	private int numeroAgencia;

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public abstract void transferir(double valor, int agencia, int c, Pessoa pt);

	public ServicoBancoDeDados getServidor() {
		return servidor;
	}

	public void setServidor(ServicoBancoDeDados servidor) {
		this.servidor = servidor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	private List<Pessoa> pessoa = new ArrayList<Pessoa>();

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeDoBanco() {
		return nomeDoBanco;
	}

	public void setNomeDoBanco(String nomeDoBanco) {
		this.nomeDoBanco = nomeDoBanco;
	}

}
