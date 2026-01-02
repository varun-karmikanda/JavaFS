package com.varunbkarmikanda.core.stringsandarrays.challenge1;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    public void run(){
        DataProcessing dp = new DataProcessing();
        String maskedCardNumber = dp.maskCreditCard("1234567890123456");
        System.out.println(maskedCardNumber);
    }
}
