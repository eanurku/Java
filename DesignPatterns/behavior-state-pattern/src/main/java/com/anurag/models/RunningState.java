package com.anurag.models;

public class RunningState extends State {

    public RunningState(Context context) {
        super(context);
    }

    @Override
    public void doAction() {
        System.out.println("running state action");
        context.setState(this);
    }
}
