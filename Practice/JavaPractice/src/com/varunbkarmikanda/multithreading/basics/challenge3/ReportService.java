package com.varunbkarmikanda.multithreading.basics.challenge3;

public class ReportService extends BasicService implements Runnable{
    @Override
    public void run() {
        connect();
        System.out.println("Generating Report");
    }
}
