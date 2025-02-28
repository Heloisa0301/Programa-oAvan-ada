package org.example;

public class ContaInvestimento extends ContaBancaria{


    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double taxa = valor * 0.02;
        if(saldo >= valor + taxa){
            System.out.println("Saque efetuado com sucesso!");
            return saldo - valor + taxa;
        }else{
            System.out.println("Saldo insuficiente");
            return saldo;
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}