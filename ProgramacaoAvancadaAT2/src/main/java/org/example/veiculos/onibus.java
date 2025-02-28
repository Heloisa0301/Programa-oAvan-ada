package org.example.veiculos;

public class onibus extends veiculo {

    private int quantidadeEixos;
    private static double tanque = 200;
    private static double consumo = 5;

    public onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if(quantidadeEixos <6 || quantidadeEixos>8){
            throw new IllegalArgumentException("onibus deve ter entre 6 a 8 eixos");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
