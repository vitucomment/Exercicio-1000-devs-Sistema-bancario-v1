package br.com.mesttra.bancomil;

import java.math.BigDecimal;

public class ClientePf extends Cliente {

	private String cpf;
	private String nome;
	private int idade;

	public ClientePf(Integer numero, Integer agencia, Integer telefone, BigDecimal saldo, BigDecimal limite, String cpf,
			String nome, int idade) {
		super(numero, agencia, telefone, saldo, limite);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
