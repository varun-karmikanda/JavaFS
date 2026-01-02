package com.varunbkarmikanda.core.stringsandarrays.challenge1;

public class DataProcessing {

    public String maskCreditCard(String cardNumber){

        if(cardNumber == null || cardNumber.length() != 16){
            return "INVALID CARD!!";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("X".repeat(12));
        sb.append(cardNumber.substring(12));
        return sb.toString();
    }

}
