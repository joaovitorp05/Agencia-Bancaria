package seguros;

import contas.Contas;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		Contas cc3 = new Contas();
		cc3.cliente = "Robson Vaamonde";
		cc3.saldo = 30000;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();
		System.out.println("---------------------------");

	}

}
