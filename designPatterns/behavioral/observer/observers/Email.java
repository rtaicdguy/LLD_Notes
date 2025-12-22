package designPatterns.behavioral.observer.observers;

public class Email implements Observer{
    @Override
    public void triggerEvent(Integer stockPrice) {
        System.out.println("Sending Email: Stock price has changed to: "+stockPrice);
    }
}
