package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.notifiers.Email;
import design.patterns.behavioral.strategy.notifiers.Notification;
import design.patterns.behavioral.strategy.notifiers.Sms;

public class Main {
    public static void main(String[] args) {
        Notification notification=new Sms();
        Listener listener=new Listener(notification);
        listener.sendNotification();
    }
}
