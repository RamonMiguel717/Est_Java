package exercicio2;

public class Carro extends Veiculo {

    public Carro(String placa, String marca, String modelo, int ano) {
        super(placa, marca, modelo, ano);
    }

    public double calcularIPVA() {
        double valorEstimado = Math.max(0, 30000 - (diferencaData() * 2000)); 
        return valorEstimado * 4/100;
    }

    public void exibirDetalhes() {
        System.out.println("Carro:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("IPVA: R$ " + calcularIPVA());
    }
}
