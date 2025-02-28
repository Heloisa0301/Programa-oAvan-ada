package org.example.veiculos;

import java.lang.Math;

public class caminhao extends veiculo{
    private double capacidadeCarga;
    private static double tanque = 300;
    private static double consumo_base = 6;

    public caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = Math.min(0.25, capacidadeCarga * 0.01);
        double consumoFinal = consumo_base * (1 - reducao);
        return tanque * consumoFinal;
    }
}
