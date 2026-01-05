package com.varunbkarmikanda.core.oops.challenge6;

public class PaymentProcess {

    public void executePayment(PaymentMethod paymentMethod){
        System.out.println("--- LOG: Initializing Transaction ---");
        paymentMethod.processPayment();
        System.out.println("--- LOG: Transaction Complete ---\n");
    }

}
