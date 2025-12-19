package design.patterns.behavioral.observer;

import design.patterns.behavioral.observer.observers.Call;
import design.patterns.behavioral.observer.observers.Email;

public class Main {
    public static void main(String[] args) {
        Consumer consumer=new Consumer();
        Email email=new Email();
        Call call=new Call();

        consumer.addObserver(email);
        consumer.addObserver(call);
        consumer.setStockPrice(22);
    }
}
