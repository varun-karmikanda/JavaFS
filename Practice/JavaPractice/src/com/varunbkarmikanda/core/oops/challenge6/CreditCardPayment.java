package com.varunbkarmikanda.core.oops.challenge6;

public class CreditCardPayment extends PaymentMethod{

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Charging $" +getAmount()+ " to Card " +maskCreditCardNumber(cardNumber));
    }

    public String maskCreditCardNumber(String cardNumber){
        if(cardNumber == null || cardNumber.length() != 16){
            return "INVALID CARD";
        }

        StringBuilder maskedCreditCardNumber = new StringBuilder();
        maskedCreditCardNumber.append("X".repeat(12));
        maskedCreditCardNumber.append(cardNumber.substring(12));
        return maskedCreditCardNumber.toString();
    }
}
