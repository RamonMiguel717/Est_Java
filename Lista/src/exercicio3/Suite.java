package exercicio3;

public class Suite implements Acomodacao, ServicoAdicional {

    public double calcular350(int dias) {
        return 350 * dias;
    }

    @Override
    public double calcularServico(int dias, int numeroPessoas) {
        double custoCafe = 20 * numeroPessoas * dias;
        double custoLimpeza = 30 * dias;
        return custoCafe + custoLimpeza;
    }

    @Override
    public void exibirDetalhes(int dias, int numeroPessoas) {
        double total350 = calcular350(dias);
        double totalServicos = calcularServico(dias, numeroPessoas);
        double custoTotal = total350 + totalServicos;

        System.out.println("Suíte:");
        System.out.println("Diária: R$ " + 350);
        System.out.println("Dias: " + dias);
        System.out.println("Número de Pessoas: " + numeroPessoas);
        System.out.println("Custo Total da Diária: R$ " + total350);
        System.out.println("Custo dos Serviços Adicionais: R$ " + totalServicos);
        System.out.println("Custo Total: R$ " + custoTotal);
    }

	@Override
	public double calcularDiaria(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}
}