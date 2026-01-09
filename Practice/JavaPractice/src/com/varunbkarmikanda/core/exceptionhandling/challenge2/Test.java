package com.varunbkarmikanda.core.exceptionhandling.challenge2;

public class Test {
    public static void main(String[] args) {

        String message = "Hello, World!";

        LogWriter logWriter = new LogWriter();
        logWriter.logTransaction(message);
    }
}