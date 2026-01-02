package com.varunbkarmikanda.core.operationandcontrolflow.challenge2;

public class Test {
    public static void main(String[] args) {
        int number = 200;

        CheckNumbers checkNumbers = new CheckNumbers(number);
        checkNumbers.specialNumber();

        System.out.println(checkNumbers.getTotalIterations());
        System.out.println(checkNumbers.getRange());
    }
}
