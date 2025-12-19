package design.patterns.behavioral.strategy;

import design.patterns.behavioral.strategy.notifiers.Notification;

public class Listener {
    private final Notification notification;
    Listener(Notification notification){
        this.notification=notification;
    }
    void sendNotification(){
        notification.send();
    }
    }
