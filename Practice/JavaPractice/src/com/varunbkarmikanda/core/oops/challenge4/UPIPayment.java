package com.varunbkarmikanda.core.oops.challenge4;

public class UPIPayment extends PaymentMethod{

    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    public void processPayment(){
        System.out.printf("Requesting $%f from UPI ID %s\n", getAmount(), upiId);
    }
}
