package com.anurag.models;

public class Context {
    State state;

    void setState(State state){
        this.state=state;
    }

    public State getState() {
        return state;
    }
}
