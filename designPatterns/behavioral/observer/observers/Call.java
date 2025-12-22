package designPatterns.behavioral.observer.observers;

public class Call implements Observer{
    @Override
    public void triggerEvent(Integer stockPrice) {
        System.out.println("Call: Stock price has changed to: "+stockPrice);
    }
}
