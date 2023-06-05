package banco;

public class ContaInvestimento extends ContaCorrente{
	
	public ContaInvestimento(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    public void rendimentoInvestimento() {
        double rendimento = getSaldo() * 0.10;
        depositar(rendimento);
        System.out.println("Rendimento da Conta Investimento: R$" + rendimento);
    }
	
}
