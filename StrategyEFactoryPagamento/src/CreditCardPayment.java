import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount){
        System.out.println("Digite o número de seu cartão: ");
        String numeroCartao = scanner.nextLine();

        System.out.println("Informe o CVV (código de segurança): ");
        String numeroCVV = scanner.nextLine();

        System.out.println("Pagamento de " + amount + " realizado com sucesso no cartão: " + numeroCartao);
    }
}
