package com.varunbkarmikanda.core.oops.challenge6;

public class Test {
    public static void main(String[] args) {
//        PaymentMethod creditCardPayment = new CreditCardPayment(5000, "1234567890125555");
//        creditCardPayment.executePayment(creditCardPayment);
//
//        PaymentMethod upiPayment = new UPIPayment(15000, "user@okicic");
//        upiPayment.executePayment(upiPayment);

        PaymentProcess paymentProcess = new PaymentProcess();

        PaymentMethod card = new CreditCardPayment(5000, "1234567890125555");
        PaymentMethod upi = new UPIPayment(15000, "user@okicic");

        paymentProcess.executePayment(card);
        paymentProcess.executePayment(upi);
    }
}
