package br.com.mesttra.bancomil.service;

import br.com.mesttra.bancomil.cliente.Cliente;
import br.com.mesttra.bancomil.cliente.ClientePj;

public class FuncoesGerente {
	
	ClientePj[] clientes = new ClientePj[49];
	
	public void cadastrarCliente() {
		clientes[0] = new ClientePj("Victor");
		System.out.println((clientes[0].getNomeSocial()));
	}
}
