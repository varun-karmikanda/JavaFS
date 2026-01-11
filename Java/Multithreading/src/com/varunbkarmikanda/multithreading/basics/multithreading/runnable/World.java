package com.varunbkarmikanda.multithreading.basics.multithreading.runnable;

public class World implements Runnable{
    @Override
    public void run() {
        for (; ; ){
            System.out.println("World");
//            System.out.println(Thread.currentThread().getName());
        }
    }
}
