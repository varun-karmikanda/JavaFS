package com.varunbkarmikanda.multithreading.interthreadcomm.challenge6;

public class SequenceCoordinator {
    private int status = 1;

    public synchronized void printA(){
        while (status != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("A ");
        status = 2;
        notifyAll();
    }

    public synchronized void printB(){
        while (status != 2){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("B ");
        status = 3;
        notifyAll();
    }

    public synchronized void printC(){
        while (status != 3){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("C ");
        status = 1;
        notifyAll();
    }
}
