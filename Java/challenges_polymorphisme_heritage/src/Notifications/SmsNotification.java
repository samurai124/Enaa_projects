package Notifications;

public class SmsNotification extends Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("sms notification \nmessage : "+message);
    }
}
