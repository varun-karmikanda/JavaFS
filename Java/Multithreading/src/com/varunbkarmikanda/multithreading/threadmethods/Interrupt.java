package com.varunbkarmikanda.multithreading.threadmethods;

public class Interrupt extends Thread{

    public Interrupt(String name){
        super(name);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e);
        }
    }

    public static void main(String[] args) {
        Interrupt thread = new Interrupt("Interruption");
        thread.start();
        thread.interrupt();
    }

}
