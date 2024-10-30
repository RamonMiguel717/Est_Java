package exercicio3;

public class QuartoSimples implements Acomodacao, ServicoAdicional {

    public double calcular100(int dias) {
        return 100 * dias;
    }

    public double calcularServico(int dias, int numeroPessoas) {
        double custoCafe = 20 * numeroPessoas * dias;
        double custoLimpeza = 30 * dias;
        return custoCafe + custoLimpeza;
    }

    public void exibirDetalhes(int dias, int numeroPessoas) {
        double total100 = calcular100(dias);
        double totalServicos = calcularServico(dias, numeroPessoas);
        double custoTotal = total100 + totalServicos;

        System.out.println("Quarto Simples:");
        System.out.println("Diária: R$ " + 100);
        System.out.println("Dias: " + dias);
        System.out.println("Número de Pessoas: " + numeroPessoas);
        System.out.println("Custo Total da Diária: R$ " + total100);
        System.out.println("Custo dos Serviços Adicionais: R$ " + totalServicos);
        System.out.println("Custo Total: R$ " + custoTotal);
    }

	public double calcularDiaria(int dias) {
		// TODO Auto-generated method stub
		return 0;
	}
}