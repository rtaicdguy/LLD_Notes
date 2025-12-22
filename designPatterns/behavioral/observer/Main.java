package designPatterns.behavioral.observer;

import designPatterns.behavioral.observer.observers.Call;
import designPatterns.behavioral.observer.observers.Email;

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
