package com.anurag.models;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    abstract public void update();
}
