import java.util.Random;

public class PixPayment implements PaymentStrategy{
    private int geradorCodigoPix(){
        return new Random().nextInt(50000000); //Informa o código pix randomicamente 
    }

    @Override
    public void processPayment(double amount){ //usa o metodo da interface para visualizar seu funcionamento
        System.out.println("Método PIX escolhido.");
        System.out.println("Código PIX: " + geradorCodigoPix());
        System.out.println("Pagamento de " + amount + " realizado com sucesso!");
    }

}
