package com.varunbkarmikanda.multithreading.threadmethods;

public class Yield extends Thread{

    public Yield(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Yield t1 = new Yield("T1");
        Yield t2 = new Yield("T2");

        t1.start();
        t2.start();
    }

}
