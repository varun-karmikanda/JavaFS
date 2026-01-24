package com.varunbkarmikanda.multithreading.interthreadcomm.challenge2;

public class Test {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        Thread consumer = new Thread(() -> {
            try{
                while (!Thread.currentThread().isInterrupted()){
                    String msg = buffer.consume();
                    System.out.println(Thread.currentThread().getName() + " | Processing resource: " + msg);
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " | Consumer interrupted! Closing down.");
            }
        }, "CONSUMER");

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                buffer.produce("Resource #" + i);
            }
            System.out.println(Thread.currentThread().getName() + " | Process completed.");
            consumer.interrupt();
        }, "PRODUCER");

        producer.start();
        consumer.start();
    }
}
