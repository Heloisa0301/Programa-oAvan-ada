package org.example.veiculos;

public class carro extends veiculo {
    private String tipoCarro;
    private static double tanque = 50;
    private static double consumo = 12;

    public carro(String marca, String modelo, int ano, int capacidadePassageiros,  String tipoCarro, String combustivel) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
