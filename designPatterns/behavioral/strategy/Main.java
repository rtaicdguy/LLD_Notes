package designPatterns.behavioral.strategy;

import designPatterns.behavioral.strategy.notifiers.Notification;
import designPatterns.behavioral.strategy.notifiers.Sms;

public class Main {
    public static void main(String[] args) {
        Notification notification=new Sms();
        Listener listener=new Listener(notification);
        listener.sendNotification();
    }
}
