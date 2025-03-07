import java.util.Random;

public class PixPayment implements PaymentStrategy{
    private int geradorCodigoPix(){
        return new Random().nextInt(50000000); //Gera um código númerico aleatório como código PIX (não consegui incluir letras)
    }

    @Override
    public void processPayment(double amount){ //uso do metodo da Interface PaymentSrategy (bem simples, apenas para demonstrar o funcionamento)
        System.out.println("Método PIX escolhido.");
        System.out.println("Código PIX: " + geradorCodigoPix());
        System.out.println("Pagamento de " + amount + " realizado com sucesso!");
    }

}
