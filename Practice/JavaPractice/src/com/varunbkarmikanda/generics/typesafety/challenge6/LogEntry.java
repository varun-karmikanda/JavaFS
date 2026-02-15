package com.varunbkarmikanda.generics.typesafety.challenge6;

public class LogEntry {

    private String message;

    public String getMessage(){
        return message;
    }

    public <T> LogEntry(T data){
        this.message = "LOG [" + data.getClass().getSimpleName() + "]: " + data;
    }
}
