package com.varunbkarmikanda.multithreading.synchronization;

public class Counter {

    private int count = 0;

    // Critical section
    public synchronized void increment(){
        count++;
    }

//    public void increment(){
//        synchronized (this){
//            count++;
//        }
//    }

    public int getCount(){
        return count;
    }

}
