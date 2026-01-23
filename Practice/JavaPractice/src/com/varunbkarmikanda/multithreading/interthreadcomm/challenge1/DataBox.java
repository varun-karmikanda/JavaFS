package com.varunbkarmikanda.multithreading.interthreadcomm.challenge1;

public class DataBox {
    private String message;

    private boolean hasMessage = false;

    public synchronized void produce(String message){
        while (hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.hasMessage = true;
        this.message = message;
        System.out.println(Thread.currentThread().getName() + " | Sent: " +message);
        notifyAll();
    }

    public synchronized String consume(){
        while (!hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        String received =this.message;
        this.hasMessage = false;
        System.out.println(Thread.currentThread().getName() + " | Received: " + received);
        notifyAll();
        return received;
    }
}
