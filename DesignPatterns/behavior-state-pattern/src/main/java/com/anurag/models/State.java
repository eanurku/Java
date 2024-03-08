package com.anurag.models;


public abstract class State {

    Context context;

    public State(Context context) {
        this.context = context;
    }

    public abstract void doAction();
}
