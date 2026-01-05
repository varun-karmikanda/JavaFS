package com.varunbkarmikanda.core.oops.challenge6;

public abstract class PaymentMethod {

    private double amount;

    public PaymentMethod(Double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

//    public void executePayment(PaymentMethod p){
//        p.processPayment();
//    }

    public abstract void processPayment();

}
