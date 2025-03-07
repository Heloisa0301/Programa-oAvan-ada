import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentStrategy paymentStrategy;

        System.out.println("Digite o Valor da Transação: R$");
        double amount = scanner.nextDouble();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: PIX");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        int op = scanner.nextInt();

        switch (op){                             
            case 1:
                paymentStrategy = new PixPayment(); //recebe os meios de pagamento e permite padronizar no estrategy caso precise no futuro adicionar algo
                break;                              
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;

            case 3:
                paymentStrategy = new BoletoPayment();
                break;

            default:
                System.out.println("Opção inválida.");
                return;
        }
                                    
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);  //ao compilar o processo de pagamento em uma estrutura de opções, ela é executada uma vez só por aqui 
    }                                             
}                                                
