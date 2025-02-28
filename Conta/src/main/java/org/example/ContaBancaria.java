package org.example;

public abstract class ContaBancaria {
    int NumeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        NumeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    public abstract double sacar(double valor);

    public void exibirDetalhes(){
        System.out.println("Numero da conta: " + NumeroConta + " Titular: " + titular + " saldo: " + saldo);
    }
}
