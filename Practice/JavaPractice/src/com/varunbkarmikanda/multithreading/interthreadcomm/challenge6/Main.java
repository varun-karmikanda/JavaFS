package com.varunbkarmikanda.multithreading.interthreadcomm.challenge6;

public class Main {
    public static void main(String[] args) {
        SequenceCoordinator coordinator = new SequenceCoordinator();

        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                coordinator.printA();
            }
        }, "Thread-A");
        Thread threadB = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                coordinator.printB();
            }
        }, "Thread-B");
        Thread threadC = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                coordinator.printC();
            }
        }, "Thread-C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
