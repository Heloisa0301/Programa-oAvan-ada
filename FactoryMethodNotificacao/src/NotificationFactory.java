public class NotificationFactory{
    public static Notification createNotification(String type){
        switch(type){
            case "email":
                return new EmailNotification();

            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

        }
        return null;
    }
}
