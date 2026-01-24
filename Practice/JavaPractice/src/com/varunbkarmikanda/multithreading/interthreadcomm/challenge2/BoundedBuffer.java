package com.varunbkarmikanda.multithreading.interthreadcomm.challenge2;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {

    private final Queue<String> queue = new LinkedList<>();

    private final int CAPACITY = 5;

    public synchronized void produce(String log){
        while (queue.size() >= CAPACITY){
            try {
                System.out.println(Thread.currentThread().getName() + " | Queue is full waiting.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        queue.add(log);
        System.out.println(Thread.currentThread().getName() + " | " + log + " was produced added to the queue.");
        notifyAll();
    }

    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
//        String log = queue.peek();
//        queue.remove();
        String log = queue.poll();
        System.out.println(Thread.currentThread().getName() + " | " + log + " was removed.");
        notifyAll();
        return log;
    }

}
