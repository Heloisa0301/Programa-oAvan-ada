public class PaymentFactory {
    public static PaymentStrategy createPayment(String type){ //Crie instâncias das classes de maneira automática dentro desta classe. Isso elimina a necessidade de especificar os nomes das classes diretamente e facilita a chamada, especialmente quando há várias classes para utilizar.
        switch (type){                                        
            case "pix":                                       
                return new PixPayment();                      
                
            case "boleto":
                return new BoletoPayment(); //cria as instancias conforme a necessidade

            case "cartao":
                return new CreditCardPayment();

        }
        return null;
    }
}
