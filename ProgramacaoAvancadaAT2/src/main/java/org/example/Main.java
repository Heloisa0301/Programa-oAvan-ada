package org.example;

import org.example.veiculos.veiculo;
import org.example.veiculos.carro;
import org.example.veiculos.caminhao;
import org.example.veiculos.onibus;
import org.example.veiculos.especiais.carroEletrico;
import org.example.veiculos.especiais.caminhaoRefrigerado;
//lembrar de importar a pasta dos veiculos, pois eles estão em uma subpasta

public class Main {
    public static void main(String[] args) {
        veiculo carro = new carro("Fiat","Palio",2012,5,"Flex","Hatch");
        veiculo caminhao = new caminhao("Volvo","1135",2022,2,"Diesel",10);
        veiculo onibus = new onibus("Mercedes-Benz","MarcoPolo",2010,40,"Biodiesel",6);
        veiculo carroEletrico = new carroEletrico("Fiat","500e",2024,4,"Subcompacto","Eletrecidade",24);
        veiculo caminhaoRefrigerado = new caminhaoRefrigerado("Scania","Freeza",2017,2,"Diesel",2,2);

        veiculo[] veiculos = {carro, caminhao, onibus, carroEletrico, caminhaoRefrigerado};

        for (veiculo v : veiculos) {
            v.exibirDetalhes();
            System.out.println("Autonomia: " + v.calcularAutonomia() + " km");
            System.out.println("-------------------------");
        }
    }
}