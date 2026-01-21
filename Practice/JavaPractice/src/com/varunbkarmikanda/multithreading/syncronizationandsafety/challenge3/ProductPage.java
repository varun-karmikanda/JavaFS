package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProductPage {
    private double price = 99.99;

    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public double getPrice() {
        try{
            rwLock.readLock().lock();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " | Reading price: " + price);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.readLock().unlock();
        }
        return price;
    }

    public void setPrice(double price) {
        try{
            rwLock.writeLock().lock();
            Thread.sleep(2000);
            this.price = price;
            System.out.println(Thread.currentThread().getName() + " | Price set to: " + price);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.writeLock().unlock();
        }
    }
}
