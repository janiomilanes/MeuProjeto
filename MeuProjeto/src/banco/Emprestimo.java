package banco;

public class Emprestimo {
	
	private double valor;
    private double taxaJuros;
    private int prazoMeses;

    public Emprestimo(double valor, double taxaJuros, int prazoMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public double calcularValorTotal() {
        double valorJuros = valor * taxaJuros / 100;
        return valor + valorJuros;
    }

    public double calcularValorParcelaMensal() {
        double valorTotal = calcularValorTotal();
        return valorTotal / prazoMeses;
    }

}
