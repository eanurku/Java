package com.anurag.Multithreading.CreatingBasicThreads;


class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread()+" i= "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ImplementsRunnableInterface {

    public static void main(String[] args) {

        Thread thread1=new Thread(new MyRunnable());
        Thread thread2=new Thread(new MyRunnable());

        thread1.start();
        thread2.start();



    }
}
