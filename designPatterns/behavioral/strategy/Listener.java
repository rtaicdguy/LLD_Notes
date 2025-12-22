package designPatterns.behavioral.strategy;

import designPatterns.behavioral.strategy.notifiers.Notification;

public class Listener {
    private final Notification notification;
    Listener(Notification notification){
        this.notification=notification;
    }
    void sendNotification(){
        notification.send();
    }
    }
