package com.javaworld.javachallengers.observable;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    protected List<Observer> subscriber = new ArrayList<>();
    protected String name;
    protected String newEmail;

    public Newsletter(String name) {
        this.name = name;
    }

    public void addNewEmail(String newEmail) {
        this.newEmail = newEmail;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        this.subscriber.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        this.subscriber.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscriber.forEach(subscriber -> subscriber.update(newEmail));
    }
}
