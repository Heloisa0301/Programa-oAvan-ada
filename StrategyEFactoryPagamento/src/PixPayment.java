import java.util.Random;

public class PixPayment implements PaymentStrategy{
    private int geradorPix(){
        return new Random().nextInt(1000000000);
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Código Pix: " + geradorPix());
        System.out.println("Pagamento de " + amount + "realizado com sucesso.");
    }
}
