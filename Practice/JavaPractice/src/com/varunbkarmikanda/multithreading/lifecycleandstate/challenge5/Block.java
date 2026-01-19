package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge5;

public class Block {

    public final static Object lock =  new Object();

    public static void main(String[] args) throws InterruptedException {


        Thread A = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired the lock. Sleeping for 5seconds");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        },"Thread-A"
        );

        Thread B = new Thread(() -> {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            }
        }, "Thread-B");

        A.start();

        Thread.sleep(100);

        B.start();
        Thread.sleep(100);
        System.out.println(B.getName()+ " : " + B.getState());
    }
}
