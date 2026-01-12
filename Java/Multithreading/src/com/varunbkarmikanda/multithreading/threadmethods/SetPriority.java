package com.varunbkarmikanda.multithreading.threadmethods;

public class SetPriority extends Thread{

    public SetPriority(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            StringBuffer a = new StringBuffer();
            for (int j = 0; j < 10000; j++) {
                a.append("a");
            }
            System.out.println(Thread.currentThread().getName() + " | Count: " + i + " | Priority: " + Thread.currentThread().getPriority());
            try{
                Thread.sleep(100);
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
//        SetPriority t1 = new SetPriority("varun");
//        t1.start();

        SetPriority low = new SetPriority("LOW   ");
        SetPriority medium = new SetPriority("MEDIUM");
        SetPriority high = new SetPriority("HIGH  ");

        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        medium.start();
        high.start();
    }
}
