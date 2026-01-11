package com.varunbkarmikanda.multithreading.basics.multithreading.thread;

public class World extends Thread{
    @Override
    public void run() {

        for (; ; ){
            System.out.println("World");
//            System.out.println(Thread.currentThread().getName());
        }

    }
}
