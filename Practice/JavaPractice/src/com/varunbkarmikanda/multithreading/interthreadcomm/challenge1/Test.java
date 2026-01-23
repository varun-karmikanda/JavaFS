package com.varunbkarmikanda.multithreading.interthreadcomm.challenge1;

public class Test {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                dataBox.produce(Thread.currentThread().getName() + " | Message #" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            dataBox.produce("DONE");
        }, "Producer");
        
        Thread consumer = new Thread(() -> {
            while (true){
                String message = dataBox.consume();
                if("DONE".equals(message)) break;
            }
            System.out.println(Thread.currentThread().getName() + " | All messages received. Exiting...");
        }, "Consumer");

        producer.start();
        consumer.start();

//        new Thread(() -> dataBox.produce("DATA"), "Producer").start();
//
//        new Thread(() -> dataBox.consume(), "Consumer").start();
    }
}
