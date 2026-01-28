package com.varunbkarmikanda.volatilekeyword;

class SharedResource{

    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("Writer made flag True");
        this.flag = true;
    }

    public void printFlag(){
        while (!flag){

        }
        System.out.println("Flag is True!");
    }
}

public class Volatile {
    public static void main(String[] args){
        SharedResource resource = new SharedResource();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                resource.setFlagTrue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

//        Thread readerThread = new Thread(() -> resource.printFlag());
        Thread readerThread = new Thread(resource::printFlag);

        writerThread.start();
        readerThread.start();
    }
}
