package com.anurag.models;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifySubscribers();

    String getMessage();

    void publish(String msg);
}
