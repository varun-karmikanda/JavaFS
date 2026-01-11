package com.varunbkarmikanda.core.test.warehouse1;

public class StorageFullException extends Exception {

    private String productName;
    private int currentLimit;

    public StorageFullException(String message, String productName, int currentLimit){
        super(message);
        this.productName = productName;
        this.currentLimit = currentLimit;
    }

    @Override
    public String toString(){
        return  getClass().getName()
                + ": "
                + super.getMessage()
                + " | Failed to add: "
                + productName
                + " | Limit was: "
                + currentLimit;
    }

}
