package br.com.mesttra.bancomil;

import java.util.Scanner;

import br.com.mesttra.bancomil.cliente.Cliente;
import br.com.mesttra.bancomil.cliente.ClientePf;
import br.com.mesttra.bancomil.cliente.ClientePj;
import br.com.mesttra.bancomil.cliente.Socios;
import br.com.mesttra.bancomil.service.FuncoesGerente;
import br.com.mesttra.bancomil.util.Menu;
import br.com.mesttra.bancomil.util.SaldoInsuficienteException;

public class Main {

	static Cliente[] clientes = new Cliente[49];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FuncoesGerente gerente = new FuncoesGerente();
		Menu ui = new Menu();
//		PopulaBanco();

		int cadastrados = 0;
		
		int operacao;
		Integer numeroDaConta;
		boolean flag = true;

		while (flag) {
			input = new Scanner(System.in);
			ui.cabecalho();
			ui.opcoes();
			operacao = input.nextInt();
			try {
				switch (operacao) {
				case 1:
					input = new Scanner(System.in);
					ui.opcaoCadastro();
					int op = verificaOperacaoCadastro(input);
					if (op == 1) {
						cadastrados = gerente.cadastrarClientePj(clientes, cadastrados);
					} else if (op == 2) {
						cadastrados = gerente.cadastrarClientePf(clientes, cadastrados);
					} else {
						break;
					}
					break;

				case 2:
					input = new Scanner(System.in);
					ui.consultarCliente();
					numeroDaConta = input.nextInt();
					String cliente = gerente.consultarCliente(numeroDaConta, clientes);
					System.out.println(cliente);
					break;

				case 3:
					input = new Scanner(System.in);
					ui.removerCliente();
					numeroDaConta = input.nextInt();
					gerente.removerCliente(numeroDaConta, clientes);
					break;

				case 4:
					input = new Scanner(System.in);
					ui.transferenciaBancaria();
					ui.transFonte();
					Integer numeroFonte = input.nextInt();
					ui.transDestino();
					Integer numeroDestino = input.nextInt();
					ui.valorTrans();
					Double valorTrans = input.nextDouble();
					try {
						gerente.fazerTransferencia(numeroFonte, valorTrans, numeroDestino, clientes);
					} catch (SaldoInsuficienteException e) {
						System.out.println("Saldo insuficiente na conta depositante.");
					}
					break;

				case 5:
					input = new Scanner(System.in);
					ui.alterarLimite();
					numeroDaConta = input.nextInt();
					Double limiteAtual = gerente.consultaLimite(numeroDaConta, clientes);
					System.out.print("Limite atual da conta [ " + numeroDaConta + " ]: " + limiteAtual);
					System.out.print("\nNovo limite: ");
					Double novoLimite = input.nextDouble();
					gerente.alterarLimite(numeroDaConta, novoLimite, clientes);
					break;

				case 6:
					input = new Scanner(System.in);
					ui.deposito();
					numeroDaConta = input.nextInt();
					ui.valorDeposito();
					Double valorDeposito = input.nextDouble();
					gerente.adicionarSaldo(numeroDaConta, valorDeposito, clientes);
					break;

				case 7:
					input = new Scanner(System.in);
					ui.clientesDevedores();
					gerente.consultarClientesNegativados(clientes);
					break;
					
				case 8:
					input = new Scanner(System.in);
					ui.relatorio();
					gerente.relatorio(clientes);
					break;
				default:
					ui.sairDoSistema();
					flag = false;
				}
			} catch (NullPointerException ex) {
				System.out.println("Usuário não encontrado.");
			}
		}

	}

	public static int verificaOperacaoCadastro(Scanner input) {
		int op = input.nextInt();
		while (op < 0 && op > 2) {
			System.out.println("Opção inválida: ");
			op = input.nextInt();
		}
		return op;
	}


	public static void PopulaBanco() {

		Socios socio1 = new Socios("Associado1", 15);
		Socios socio2 = new Socios("Associado2", 10);
		Socios socio3 = new Socios("Associado3", 14);
		Socios socio4 = new Socios("Associado4", 9);
		Socios socio5 = new Socios("Associado5", 10);
		Socios socio6 = new Socios("Associado6", 11);

		Socios[] socios1 = new Socios[2];
		Socios[] socios2 = new Socios[1];
		Socios[] socios3 = new Socios[1];
		Socios[] socios4 = new Socios[2];

		socios1[0] = socio1;
		socios1[1] = socio2;
		socios2[0] = socio3;
		socios3[0] = socio4;
		socios4[0] = socio5;
		socios4[1] = socio6;

		Cliente cliente0 = new ClientePj(123456, 21, "11921252121", 0.0, 50.0, "31.735.079/0001-22", socios1,
				"Cliente1 Fantasia", "NomeClientePJ1");
		Cliente cliente1 = new ClientePj(654321, 21, "79996513762", 0.0, 500.0, "81.758.069/0001-80", socios2,
				"Cliente2 Fantasia", "NomeClientePJ2");
		Cliente cliente2 = new ClientePj(159357, 25, "71952144558", 0.0, 5000.0, "88.633.321/0001-74", socios3,
				"Cliente3 Fantasia", "NomeClientePJ3");
		Cliente cliente3 = new ClientePj(752586, 25, "81952654122", 0.0, 100.0, "47.763.323/0001-09", socios4,
				"Cliente4 Fantasia", "NomeClientePJ4");
		Cliente cliente4 = new ClientePf(485121, 20, "79956554515", 0.0, 1000.0, "839.312.180-90", "NomeClientePF1",
				21);
		Cliente cliente5 = new ClientePf(412212, 21, "73988532426", 0.0, 150.0, "783.049.570-00", "NomeClientePF2", 42);
		Cliente cliente6 = new ClientePf(213212, 25, "73981131894", 0.0, 80.0, "084.791.830-04", "NomeClientePF3", 55);
		Cliente cliente7 = new ClientePf(212215, 20, "73935341422", 0.0, 170.0, "033.875.560-80", "NomeClientePF4", 19);

		clientes[0] = cliente0;
		clientes[1] = cliente1;
		clientes[2] = cliente2;
		clientes[3] = cliente3;
		clientes[4] = cliente4;
		clientes[5] = cliente5;
		clientes[6] = cliente6;
		clientes[7] = cliente7;

	}

}
