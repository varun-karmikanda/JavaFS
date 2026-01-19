package com.varunbkarmikanda.multithreading.basics.challenge3;

public class Main {
    public static void main(String[] args){
        new Thread(new ReportService()).start();
    }
}
