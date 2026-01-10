package com.varunbkarmikanda.core.exceptionhandling.challenge3;

public class SecurityException extends Exception{

    public SecurityException(String message){
        super(message);
    }

    public SecurityException(String message, Throwable cause){
        super(message, cause);
    }

    public SecurityException(String message, Throwable cause, boolean enableSuppression, boolean stackTrace){
        super(message, cause, enableSuppression, stackTrace);
    }

}