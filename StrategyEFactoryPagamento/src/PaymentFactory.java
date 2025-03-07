public class PaymentFactory {
    public static PaymentStrategy createPayment(String type){ //instancia as classes dinamiicamente nessa classe
        switch (type){                                        //isso tira a necessidade de especificar as classes
            case "pix":                                       //diretamente e torna a chamada mais simples. Principalmente
                return new PixPayment();                      //quando existem várias classes a serem chamadas

            case "boleto":
                return new BoletoPayment(); //instâncias sendo criadas conforme as necessidades...

            case "cartao":
                return new CreditCardPayment();

        }
        return null;
    }
}
