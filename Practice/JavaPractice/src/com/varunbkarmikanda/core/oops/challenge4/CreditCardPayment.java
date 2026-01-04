package com.varunbkarmikanda.core.oops.challenge4;

public class CreditCardPayment extends PaymentMethod{

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    private String maskCreditCardNumber(String cardNumber){
        if(cardNumber == null || cardNumber.length() != 16){
            return "INVALID CARD!";
        }
        StringBuilder maskedCreditCardNumber = new StringBuilder();
        maskedCreditCardNumber.append("X".repeat(12));
        maskedCreditCardNumber.append(cardNumber.substring(12));
        return maskedCreditCardNumber.toString();
    }

    public void processPayment(){
        System.out.printf("Charging $%f to Card %s\n", getAmount(), maskCreditCardNumber(cardNumber));
    }

}
