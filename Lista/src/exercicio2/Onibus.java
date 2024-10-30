package exercicio2;

public class Onibus extends Veiculo {

    public Onibus(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    public double calcularIPVA() {
        double valorEstimado = Math.max(0, 60000 - (diferencaData() * 3000));
        return valorEstimado * 2/100;
    }

    public void exibirDetalhes() {
        System.out.println("Ônibus:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}
