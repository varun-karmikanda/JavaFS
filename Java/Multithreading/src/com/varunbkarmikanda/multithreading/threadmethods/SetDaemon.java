package com.varunbkarmikanda.multithreading.threadmethods;

public class SetDaemon extends Thread{

    public SetDaemon(String name){
        super(name);
    }

    @Override
    public void run(){
        while (true){
            System.out.println("Hello, DAEMON!");
//            System.out.print(" | " + Thread.currentThread().getName());
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        SetDaemon thread = new SetDaemon("t1");
        thread.setDaemon(true);
        thread.start();
//        SetDaemon t2 = new SetDaemon("t2");
//        t2.start();
        System.out.println("Main");
    }
}
