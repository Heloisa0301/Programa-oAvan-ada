public class PaymentProcessor {             //Classe para executar a forma de pagamento sem a necessidade de chamá-la diretamente
    private PaymentStrategy paymentStrategy;//facilitando a adição ou remoção de, nesse caso, qualquer meio de pagamento desejado.

    public PaymentProcessor(PaymentStrategy paymentStrategy) { //construtor
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) { //na classe main esse metodo é chamado e ele "substitui" o metodo padrão das classes
        paymentStrategy.processPayment(amount); //"substitui" na hora de chamar, apenas, pois ele redireciona para o metodo correto após ser chamado
    }
}
