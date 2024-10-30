package exercicio1;

public class ContaBancaria {
    private String cliente;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String cliente, String numeroConta, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
