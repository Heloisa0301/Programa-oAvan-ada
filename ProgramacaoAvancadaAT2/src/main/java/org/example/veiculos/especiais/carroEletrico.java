package org.example.veiculos.especiais;

import org.example.veiculos.carro;

public class carroEletrico extends carro{
    private double bateriaKWh;
    private static double consumo_eletrico = 5;

    public carroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String tipoCarro, String combustivel, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, tipoCarro, combustivel);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia(){
        return bateriaKWh * consumo_eletrico;
    }
}
