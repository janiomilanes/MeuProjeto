package banco;

public class BancoDigital {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente("12345", 1000.00);
        contaCorrente.depositar(500.00);
        contaCorrente.sacar(200.00);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca("54321", 2000.00);
        contaPoupanca.depositar(1000.00);
        contaPoupanca.sacar(500.00);
        contaPoupanca.rendimentoPoupanca();
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());

        ContaInvestimento contaInvestimento = new ContaInvestimento("98765", 5000.00);
        contaInvestimento.depositar(2000.00);
        contaInvestimento.sacar(1000.00);
        contaInvestimento.rendimentoInvestimento();
        System.out.println("Saldo da Conta Investimento: " + contaInvestimento.getSaldo());
        
        Emprestimo emprestimo = new Emprestimo(10000.0, 10.0, 12);
        double valorTotal = emprestimo.calcularValorTotal();
        double valorParcelaMensal = emprestimo.calcularValorParcelaMensal();
        System.out.println("Valor total do empréstimo: R$" + valorTotal);
        System.out.println("Valor das parcelas mensais: R$" + valorParcelaMensal);

	}

}
