package design.patterns.behavioral.observer.observers;

import design.patterns.behavioral.observer.Consumer;

public class Email implements Observer{
    @Override
    public void triggerEvent(Integer stockPrice) {
        System.out.println("Sending Email: Stock price has changed to: "+stockPrice);
    }
}
