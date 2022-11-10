package br.com.mesttra.bancomil.cliente;

public class Socios {

	private String nome;
	private Integer idade;

	public Socios(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "\n  Nome: " + getNome() + " Idade: " + getIdade() ;
	}

}
