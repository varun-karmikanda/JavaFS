package com.varunbkarmikanda.multithreading.basics.multithreading.runnable;

import com.varunbkarmikanda.multithreading.basics.multithreading.thread.World;

public class TestRunnable {
    public static void main(String[] args) {

        World world = new World();
        Thread thread = new Thread(world);
        thread.start();

        for (; ; ){
            System.out.println("Hello");
//            System.out.println(Thread.currentThread().getName());
        }

    }
}
