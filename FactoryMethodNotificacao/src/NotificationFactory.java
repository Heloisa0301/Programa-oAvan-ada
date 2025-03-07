public class NotificationFactory{
    public static Notification createNotification(String type){
        switch(type){
            case "email":
                return new EmailNotification();//a classe fabrica instanciando para que nao seja diretamente feito na classe main padronizando o processo

            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

        }
        return null;
    }
}
