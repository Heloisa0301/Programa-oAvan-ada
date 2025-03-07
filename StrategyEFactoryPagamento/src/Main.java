import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = "";

        System.out.println("Digite o Valor da Transação: R$");
        double amount = scanner.nextDouble();

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: PIX");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        int op = scanner.nextInt();

        switch(op){
            case 1:
                type = "pix"; //variavel que recebe o tipo como string para criação da mesma na classe factory
                break;

            case 2:
                type = "cartao";
                break;

            case 3:
                type = "boleto";
                break;

        }

        PaymentStrategy paymentMethod = PaymentFactory.createPayment(type); //passando as informações para a criação da instância
        PaymentProcessor processor = new PaymentProcessor(paymentMethod);
        processor.executePayment(amount); //execução do pagamento pelo método da instancia criada

    }
}