import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{ //classe simples, sem muitas máscaras ou restrições para digitação...
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount){
        System.out.println("Método Cartão de Crédito escolhido.");
        System.out.println(" ");

        System.out.println("Digite o número do cartão: ");
        String numeroCartao = scanner.nextLine();

        System.out.println("Informe o número de segurança do cartão: ");
        String numeroSeguranca = scanner.nextLine();

        System.out.println("Pagamento de " + amount + " realizado com sucesso!");

    }
}
