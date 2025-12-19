package design.patterns.behavioral.strategy.notifiers;

public class Sms implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
