package org.example;

public class ContaSalario extends ContaCorrente{
    private int saqueGratuito = 1;

    public ContaSalario(int numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo, limite);
    }

    @Override
    public double sacar (double valor){
        if(saqueGratuito > 0){
            saqueGratuito--;
            return super.sacar(valor);
        }else{
            return super.sacar(valor+5);
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
