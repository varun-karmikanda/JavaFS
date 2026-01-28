package com.varunbkarmikanda.atomickeyword;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity {
//    private int counter = 0;

    AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
//        this.counter++;
        this.counter.incrementAndGet();
    }

    public int getCounter(){
//        return counter;
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Atomicity counter = new Atomicity();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter = " + counter.getCounter());
    }
}
