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
                paymentStrategy = new PixPayment(); //aqui, o PaymentStrategy recebe cada um dos meios de pagamento
                break;                              //isso permite uma padronização nas estratégias de pagamento e
                                                    //simplifica a adição de qualquer coisa futuramente.
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
        paymentProcessor.executePayment(amount);  //ao em vez de executar o processamento do pagamento em cada case do switch
    }                                             //a execução é realizada uma vez só, por aqui. Economizando não só linhas de código
}                                                 //mas também vários fios de cabelo do programador. Tudo isso graças as duas simples classes adicionadas.