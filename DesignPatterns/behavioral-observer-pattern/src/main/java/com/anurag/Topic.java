package com.anurag;

import com.anurag.models.Observer;
import com.anurag.models.Subject;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    List<Observer> subscribers;
    private String message;
    private boolean changed;

    public Topic() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        subscribers.add(observer);


    }

    @Override
    public void unregister(Observer observer) {

        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        subscribers.forEach(subsriber->subsriber.update());


    }

    public void publish(String message){
        this.message=message;
        this.changed=true;
        this.notifySubscribers();

        this.changed=false;

    }

    public String getMessage() {
        return message;
    }

}
