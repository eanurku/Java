package com.anurag.models;

public class EndState extends State {

    public EndState(Context context) {
        super(context);
    }

    @Override
    public void doAction() {
        System.out.println("end state action");
        context.setState(this);
    }
}
