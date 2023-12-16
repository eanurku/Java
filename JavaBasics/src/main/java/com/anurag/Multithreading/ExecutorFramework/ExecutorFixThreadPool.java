package com.anurag.Multithreading.ExecutorFramework;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class process implements Runnable{

    int id;

    public process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"  "+id);
    }
}

public class ExecutorFixThreadPool {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=1;i<20;i++){
            executor.execute(new process(i));
        }
        executor.shutdown();
        System.out.println("shutdown called");
        executor.awaitTermination(10000,TimeUnit.MILLISECONDS);
        System.out.println("await termination called");


    }

}
