package br.com.mesttra.bancomil;

import java.math.BigDecimal;

public abstract class Cliente {

	private Integer numero;
	private Integer agencia;
	private Integer telefone;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	public Cliente(Integer numero, Integer agencia, Integer telefone, BigDecimal saldo, BigDecimal limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.telefone = telefone;
		this.saldo = saldo;
		this.limite = limite;
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

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

}
