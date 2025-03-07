public class PaymentProcessor {             //executa a forma de pagamento sem chamar ela diretamente 
    private PaymentStrategy paymentStrategy;//remove ou adiciona qualuqer meio de pagamento

    public PaymentProcessor(PaymentStrategy paymentStrategy) { 
        this.paymentStrategy = paymentStrategy;
    }
                                        
    public void executePayment(double amount) { //substitui o metodo padrão de cada classe padronizando as chamadas
        paymentStrategy.processPayment(amount); //facilita a adição de novos metodos com novas classes 
    }
}
