public class PaymentProcessor {              //executa o pagamento sem chamar diretamente 
    private PaymentStrategy paymentStrategy; //substitui as classe concretas quando chamadas facilitando a manutenção geral do código

    public PaymentProcessor (PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
