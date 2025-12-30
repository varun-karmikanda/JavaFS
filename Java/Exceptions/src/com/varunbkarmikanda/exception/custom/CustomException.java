package com.varunbkarmikanda.exception.custom;

public class CustomException extends Exception{

    private String baseMessage;

    private double amount;

    public double getAmount(){
        return amount;
    }

//    public CustomException(String message, double amount){
//        super(message);
//        this.amount = amount;
//    }
//    @Override
//    public String toString() {
//        return super.getMessage() + " | Attempted withdrawal: " + amount;
//    }

    public CustomException(String message, double amount){
        this.baseMessage = message;
        this.amount = amount;
    }

    @Override
    public String getMessage(){
        return baseMessage + " | Attempted withdrawal: " + amount;
    }

    @Override
    public String toString(){
        return getClass().getName()
                + ": "
                + getMessage();
    }

}
