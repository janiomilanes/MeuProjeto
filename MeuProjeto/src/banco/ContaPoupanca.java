package banco;

public class ContaPoupanca extends ContaCorrente{
	
	 public ContaPoupanca(String numeroConta, double saldo) {
	        super(numeroConta, saldo);
	    }

	    public void rendimentoPoupanca() {
	        double rendimento = getSaldo() * 0.02;
	        depositar(rendimento);
	        System.out.println("Rendimento da Conta Poupança: R$" + rendimento);
	    }
	
}
