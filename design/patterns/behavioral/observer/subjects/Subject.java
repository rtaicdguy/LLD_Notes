package design.patterns.behavioral.observer.subjects;

import design.patterns.behavioral.observer.observers.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
