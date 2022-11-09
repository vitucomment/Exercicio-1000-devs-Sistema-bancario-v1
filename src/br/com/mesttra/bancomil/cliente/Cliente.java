package br.com.mesttra.bancomil.cliente;

import br.com.mesttra.bancomil.util.SaldoInsuficienteException;

public abstract class Cliente {

	private Integer numero;
	private Integer agencia;
	private Integer telefone;
	private Double saldo;
	private Double limite;

	public Cliente() {
	}

	public Cliente(Integer numero, Integer agencia, Integer telefone, Double saldo, Double limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.telefone = telefone;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void transfere(Double valor, Cliente destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public void deposita(Double valor) {
		this.saldo += valor;
	}

	public void saca(Double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		this.saldo -= valor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

}
