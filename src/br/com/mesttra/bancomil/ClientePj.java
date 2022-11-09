package br.com.mesttra.bancomil;

import java.math.BigDecimal;

public class ClientePj extends Cliente {

	private String cnpj;
	private String[] socios = new String[3];
	private String nomeSocial;
	private String nomeFantasia;

	public ClientePj(Integer numero, Integer agencia, Integer telefone, BigDecimal saldo, BigDecimal limite,
			String cnpj, String[] socios, String nomeSocial, String nomeFantasia) {
		super(numero, agencia, telefone, saldo, limite);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.nomeSocial = nomeFantasia;
		this.socios = socios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String[] getSocios() {
		return socios;
	}

	public void setSocios(String[] socios) {
		this.socios = socios;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
