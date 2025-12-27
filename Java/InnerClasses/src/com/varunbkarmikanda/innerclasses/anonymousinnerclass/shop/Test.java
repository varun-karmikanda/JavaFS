package com.varunbkarmikanda.innerclasses.anonymousinnerclass.shop;

public class Test {
    public static void main(String[] args) {
//        ShoppingCart shoppingCart = new ShoppingCart(367);
//        CreditCardV0 creditCard = new CreditCardV0("6351");
//        shoppingCart.processPayment(creditCard);

        ShoppingCart shoppingCart = new ShoppingCart(367);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount+ " using credit card!");
            }
        });

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid "+amount+ " using credit UPI!");
            }
        });
    }
}
