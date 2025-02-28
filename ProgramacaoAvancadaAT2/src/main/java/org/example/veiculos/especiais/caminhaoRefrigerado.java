package org.example.veiculos.especiais;

import org.example.veiculos.caminhao;

public class caminhaoRefrigerado extends caminhao {
    private double temperaturaMinima;

    public caminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia(){
        return super.calcularAutonomia() * 0.9;
    }
}
