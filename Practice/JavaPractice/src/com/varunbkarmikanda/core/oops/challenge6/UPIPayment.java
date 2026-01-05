package com.varunbkarmikanda.core.oops.challenge6;

public class UPIPayment extends PaymentMethod{

    private String upiId;

    public UPIPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }


    @Override
    public void processPayment() {
        System.out.println("Requesting $"+ getAmount()+ " from UPI ID "+ upiId);
    }
}
