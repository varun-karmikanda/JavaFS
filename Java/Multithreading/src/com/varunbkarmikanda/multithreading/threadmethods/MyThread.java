package com.varunbkarmikanda.multithreading.threadmethods;

public class MyThread extends Thread{
    @Override
    public void run() {
//        System.out.println("My thread is running...");

        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("(Without .join())Main thread continues...");

        myThread.join();
        System.out.println("(After .join())Main thread continues...");
    }
}
