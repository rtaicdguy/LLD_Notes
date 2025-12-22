package designPatterns.behavioral.observer.subjects;

import designPatterns.behavioral.observer.observers.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
