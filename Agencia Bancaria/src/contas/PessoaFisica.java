package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Contas cc1 = new Contas();
		cc1.cliente = "Leandro Ramos";
		cc1.saldo = 10000;
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		cc1.depositar(5000);
		cc1.exibirSaldo();
		System.out.println("---------------------------");
		Contas cc2 = new Contas();
		cc2.cliente = "Sirlene Sanches";
		cc2.saldo = 5000;
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		cc2.sacar(1000);
		cc2.exibirSaldo();
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println("Cliente: " + cc1.cliente);
		System.out.println("Favorecido: " + cc2.cliente);
		cc1.transferir(cc2, 1000);
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println("Relatório Gerencial");
		Contas gerente = new Contas();
		double total = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println("Saldo total: R$ " + total);
	}

}
