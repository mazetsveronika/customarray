package by.mazets.java.array.observer;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.observer.impl.CustomArrayObserverImpl;
import by.mazets.java.array.exception.CustomArrayException;


public interface CustomArrayObservable {

    void attach(CustomArrayObserver observer);

    void detach(CustomArrayObserver observer);

    void notifyObserver();

    }
