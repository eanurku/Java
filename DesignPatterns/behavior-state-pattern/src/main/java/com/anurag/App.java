package com.anurag;

import com.anurag.models.*;


public class App 
{
    public static void main( String[] args ){
        Context context = new Context();
        State start = new StartState(context);
        State running = new RunningState(context);
        State end = new EndState(context);

        start.doAction();
        System.out.println(context.getState().getClass().getCanonicalName());

        running.doAction();
        System.out.println(context.getState().getClass().getCanonicalName());

        end.doAction();
        System.out.println(context.getState().getClass().getCanonicalName());


    }
}
