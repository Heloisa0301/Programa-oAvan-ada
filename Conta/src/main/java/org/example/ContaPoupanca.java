package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if(saldo >= valor){
            saldo-=valor;
            System.out.println("Saldo efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
