package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge1;

public class Warehouse implements Runnable{

    private int stock = 10;

    public synchronized void fulfilOrder(){
        if(stock > 0){
            stock--;
            System.out.println(Thread.currentThread().getName() + " | Order filled");
        } else {
            System.out.println(Thread.currentThread().getName() + " | Out of stock!");
        }
    }

    @Override
    public void run() {
        fulfilOrder();
    }
}
