public interface PaymentStrategy {
    void processPayment(double amount); //facilita a manutenção do código, apesar de no momento ser uma classe bem vazia,
                                        //em casos de evolução e expansão do software, novos meios de pagamento só precisam reutilizar
                                        //essa interface sem fortes modificações no código existente
}
