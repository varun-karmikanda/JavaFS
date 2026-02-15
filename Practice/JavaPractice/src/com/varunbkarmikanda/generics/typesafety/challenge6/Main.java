package com.varunbkarmikanda.generics.typesafety.challenge6;

public class Main {
    public static void main(String[] args){
        LogEntry string = new LogEntry("Varun");
        System.out.println(string.getMessage());

        LogEntry logEntry = new LogEntry(63);
        System.out.println(logEntry.getMessage());

        LogEntry logEntry1 = new LogEntry(67.95);
        System.out.println(logEntry1.getMessage());

    }
}
