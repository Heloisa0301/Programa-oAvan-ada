public class PaymentProcessor {              //classe que executa o pagamento sem precisar chamá-lo diretamente
    private PaymentStrategy paymentStrategy; //facilita a manutenção geral do código  pois substitui as classes concretas na chamada

    public PaymentProcessor (PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
