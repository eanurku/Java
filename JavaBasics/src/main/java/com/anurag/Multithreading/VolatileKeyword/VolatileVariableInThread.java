package com.anurag.Multithreading.VolatileKeyword;

import java.util.Scanner;
/*
volatile keyword keeps variable updated across all thread and
threads will have latest view of variable value
 */


class SharedObject {
    private  volatile boolean running=true;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "SharedObject{" +
                "running=" + running +
                '}';
    }

}
 abstract class SampleThread extends Thread {

    abstract public void shutdown();
}

public class VolatileVariableInThread {
    public static void main(String[] args) throws InterruptedException {

        SharedObject sharedObj=new SharedObject();

        SampleThread thread1 = new SampleThread(){
            @Override
            public void run() {
                while(sharedObj.isRunning()){
                    System.out.println(Thread.currentThread()+" is running...");
                }
            }

            @Override
            public void shutdown() {
                sharedObj.setRunning(false);
            }
        };
        SampleThread thread2 = new SampleThread(){
            @Override
            public void run() {
                if(sharedObj.isRunning()){
                    for(int i=1;i>0 && sharedObj.isRunning();i++) {
                        if(i==2){
                            this.shutdown();
                        }
                        System.out.println(Thread.currentThread() + " is running...");
                    }
                }
            }

            @Override
            public void shutdown() {
                sharedObj.setRunning(false);
            }
        };

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println("main ends here");


    }
}
