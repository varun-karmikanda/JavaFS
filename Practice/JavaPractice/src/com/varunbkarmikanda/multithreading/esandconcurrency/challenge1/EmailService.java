package com.varunbkarmikanda.multithreading.esandconcurrency.challenge1;

public class EmailService implements Runnable{

    private final int userId;

    public EmailService(int userId){
        this.userId = userId;
    }

    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " sending Email to user: " + userId);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
