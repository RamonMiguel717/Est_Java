package exercicio2;

public class Caminhao extends Veiculo {

    public Caminhao(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    public double calcularIPVA() {
        double valorEstimado = Math.max(0, 80000 - (diferencaData() * 5000)); 
        return valorEstimado * 1.5/100;
    }

    public void exibirDetalhes() {
        System.out.println("Caminhão:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}
