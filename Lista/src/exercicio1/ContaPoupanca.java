package exercicio1;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, String numeroConta, double saldo, int diaRendimento) {
        super(cliente, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double novoSaldo = getSaldo() + getSaldo() * (taxaRendimento / 100);
        setSaldo(novoSaldo);
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de Rendimento: " + diaRendimento);
    }
}
