import java.util.Random;

public class BoletoPayment implements PaymentStrategy{ //funciona praticamente de mesma maneira que o PixPayment
    private int geradorCodigoBoleto(){
        return new Random().nextInt(1000000000);
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Método Boleto Escolhido.");
        System.out.println("Código Boleto: " + geradorCodigoBoleto());
        System.out.println("Pagamento de: " + amount + " realizado com sucesso!");
    }
}
