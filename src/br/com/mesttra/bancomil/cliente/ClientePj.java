package br.com.mesttra.bancomil.cliente;

public class ClientePj extends Cliente {

	private String cnpj;
	private Socios[] socios;
	private String nomeSocial;
	private String nomeFantasia;

	public ClientePj(Integer numero, Integer agencia, String telefone, Double saldo, Double limite, String cnpj,
			Socios[] socios, String nomeSocial, String nomeFantasia) {
		super(numero, agencia, telefone, saldo, limite);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.nomeSocial = nomeSocial;
		this.socios = socios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Socios[] getSocios() {
		return socios;
	}

	public void setSocios(Socios[] socios) {
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

	public String toStringSocios() {
		String msg = "";
		for(int i = 0; i < socios.length; i++) {
			msg += this.socios[i].toString();
		}
		return msg;
	}
	
	@Override
	public String toString() {
		String cliente = ("Numero: " + getNumero() + "\n" + "Agencia: " + getAgencia() + "\n" + "Telefone: "
				+ getTelefone() + "\n" + "Saldo: " + getSaldo() + "\n" + "Limite: " + getLimite() + "\n" + "Cnpj: "
				+ getCnpj() + "\n" + "Sócios: " + toStringSocios() + "\n" + "Razão social: " + getNomeSocial() + "\n"
				+ "Nome fantasia: " + getNomeFantasia() + "\n");

		return cliente;
	}
}
