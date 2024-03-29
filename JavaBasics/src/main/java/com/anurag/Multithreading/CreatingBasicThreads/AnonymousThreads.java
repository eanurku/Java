package com.anurag.Multithreading.CreatingBasicThreads;

public class AnonymousThreads {

    public static void main(String[] args) throws InterruptedException {

        //passing Runnable object to thread constructor

        Thread firstThread=new Thread(new Runnable() {
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
        });

        firstThread.start();
        Thread secondThread=new Thread(){

            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread()+" i= "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        secondThread.start();

        System.out.println(Thread.currentThread() + " main thread ends here");


    }

}
