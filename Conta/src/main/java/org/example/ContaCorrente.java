package org.example;

public class ContaCorrente extends ContaBancaria{

    private double limite;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limite) {
        super(numeroConta, titular, saldo);
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        if(saldo + limite >= valor){
            saldo -= valor;
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saldo insuficiente, mesmo com limite especial");
        }
        return saldo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}

