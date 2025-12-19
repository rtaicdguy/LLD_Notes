package design.patterns.behavioral.observer;

import design.patterns.behavioral.observer.observers.Observer;
import design.patterns.behavioral.observer.subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Subject {
    private final List<Observer> observers;
    private Integer stockPrice;
    public Consumer(){
        observers=new ArrayList<>();
    }

    public void setStockPrice(Integer stockPrice){
        this.stockPrice=stockPrice;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer: observers){
            observer.triggerEvent(stockPrice);
        }
    }


}
