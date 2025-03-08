import java.util.Random;

public class BoletoPayment implements PaymentStrategy{
    private int gerarBoleto(){
        return new Random().nextInt(50000000);
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Código do Boleto: " + gerarBoleto());
        System.out.println("Pagamento de " + amount + " realizado com sucesso.");
    }
}
