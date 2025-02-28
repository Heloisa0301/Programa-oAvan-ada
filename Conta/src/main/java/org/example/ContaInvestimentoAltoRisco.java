package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{

    private double minimo = 10000;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar (double valor){
        double taxa = valor * 0.05;
        if (valor >= minimo){
            System.out.println("Saque realizado!");
            return saldo-=valor+taxa;
        }else{
            System.out.println("Valor insuficiente");
            return saldo;
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
