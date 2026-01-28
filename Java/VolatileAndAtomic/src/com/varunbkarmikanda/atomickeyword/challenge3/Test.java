package com.varunbkarmikanda.atomickeyword.challenge3;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new ServiceRequest("User-1"), "Thread-1").start();
        new Thread(new ServiceRequest("User-2"), "Thread-2").start();
        new Thread(new ServiceRequest("User-3"), "Thread-3").start();

        Thread.sleep(2000);
    }
}
