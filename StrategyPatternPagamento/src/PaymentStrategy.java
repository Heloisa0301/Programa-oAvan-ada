public interface PaymentStrategy {
    void processPayment(double amount); //Ajuda a manter o código porque mesmo sendo uma classe simples agora no futuro novos meios de pagamento podem usar essa interface com poucas mudanças
}
