package com.varunbkarmikanda.core.oops.challenge1;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("5000");

        BankAccount bankAccount = new BankAccount("NiTR0X", bigDecimal);
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(new BigDecimal("15000"));
        System.out.println(bankAccount.getBalance());

        bankAccount.withdrawal(BigDecimal.valueOf(5000));
        System.out.println(bankAccount.getBalance());
    }
}
