package com.varunbkarmikanda.multithreading.esandconcurrency.challenge3;

import java.util.Map;

public class InventoryWorker implements Runnable{
    private Map<String, Integer> stock;

    private int updates;

    public InventoryWorker(Map<String, Integer> stock, int updates){
        this.stock = stock;
        this.updates = updates;
    }

    @Override
    public void run(){
        for (int i = 1; i <= updates; i++) {
            stock.merge("Laptop", 1, Integer::sum);
            System.out.println(Thread.currentThread().getName() + " | Updated stock!");
        }
    }
}
