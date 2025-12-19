package design.patterns.behavioral.observer.observers;

import design.patterns.behavioral.observer.Consumer;

public class Call implements Observer{
    @Override
    public void triggerEvent(Integer stockPrice) {
        System.out.println("Call: Stock price has changed to: "+stockPrice);
    }
}
