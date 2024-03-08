package com.anurag.models;

public class StartState extends State {

    public StartState(Context context) {
        super(context);
    }

    @Override
    public void doAction() {
        System.out.println("start state action");
        context.setState(this);

    }
}
