package com.varunbkarmikanda.core.oops.challenge4;

public class Test {
    public static void main(String[] args) {

        PaymentMethod[] paymentMethod = {
                new CreditCardPayment(15000.67, "1234567890125555"),
                new UPIPayment(5000.67, "user@okaxis")
        };

        for(PaymentMethod pm: paymentMethod){
            pm.processPayment();
        }

    }
}
