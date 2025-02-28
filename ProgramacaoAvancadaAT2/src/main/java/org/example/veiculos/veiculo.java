package org.example.veiculos;

public abstract class veiculo
{

    String marca;
    String modelo;
    int ano;
    String combustivel;
    int capacidadePassageiros;

    public veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca + ",Modelo: " + modelo +
        ",Ano: " + ano + ",Capacidade: " + capacidadePassageiros + " passageiros, Combustível: " + combustivel);
    }


}
