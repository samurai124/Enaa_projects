package Notifications;

public class EmailNotification extends Notification{
    @Override
    public void envoyer(String message) {
        System.out.println("Email notification\nmessage : "+message);
    }
}
