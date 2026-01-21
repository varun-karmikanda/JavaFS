package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge3;

public class Main {
    public static void main(String[] args) {
        ProductPage productPage = new ProductPage();

        Runnable readTask = () -> {
            productPage.getPrice();
        };

        Runnable writeTask = () -> {
            productPage.setPrice(149.99);
        };

//        Thread readThrea1 = new Thread(readTask, "READ-THREAD-1");
//        Thread readThrea2 = new Thread(readTask, "READ-THREAD-2");
//        Thread readThrea3 = new Thread(readTask, "READ-THREAD-3");
//        Thread readThrea4 = new Thread(readTask, "READ-THREAD-4");
//        Thread readThrea5 = new Thread(readTask, "READ-THREAD-5");
//
//        readThrea1.start();
//        readThrea2.start();
//        readThrea3.start();
//        readThrea4.start();
//        readThrea5.start();

        for (int i = 1; i <= 5; i++) {
            new Thread(readTask, "READ-THREAD-" + i).start();
        }

//        Thread writeThread1 = new Thread(writeTask, "WRITE-THREAD-1");
//        Thread writeThread2 = new Thread(writeTask, "WRITE-THREAD-2");
//
//        writeThread1.start();
//        writeThread2.start();

        for (int i = 1; i <= 5; i++) {
            new Thread(writeTask, "WRITE_THREAD-" + i).start();
        }
    }
}
