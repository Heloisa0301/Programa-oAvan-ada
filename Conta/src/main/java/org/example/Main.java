package org.example;


public class Main {
    public static void main(String[] args) {
        ContaBancaria corrente = new ContaCorrente(3653, "Heloisa", 600, 100);
        ContaBancaria poupanca = new ContaPoupanca(2532, "Carlos", 500);
        ContaBancaria investimento = new ContaInvestimento(682,"José",600);
        ContaBancaria altorisco = new ContaInvestimentoAltoRisco(963,"Carol",4556);
        ContaBancaria salario = new ContaSalario(896,"Fernanda",963,1000);

        corrente.exibirDetalhes();
        poupanca.exibirDetalhes();
        investimento.exibirDetalhes();
        altorisco.exibirDetalhes();
        salario.exibirDetalhes();
    }
}