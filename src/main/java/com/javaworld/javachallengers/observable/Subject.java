package com.javaworld.javachallengers.observable;

// Also called as Observable
public interface Subject {

    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();

}
