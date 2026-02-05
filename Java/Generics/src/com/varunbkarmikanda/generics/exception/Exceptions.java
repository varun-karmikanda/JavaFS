package com.varunbkarmikanda.generics.exception;

public class Exceptions {
}

class StringProcessingException extends Exception {
    public StringProcessingException(String message){
        super(message);
    }
}

class IntegerProcessingException extends Exception {
    public IntegerProcessingException(String message){
        super(message);
    }
}
