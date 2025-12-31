package com.varunbkarmikanda.wrapperclasses;

public class IntegerObject {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
        System.out.println(a.equals(b));    // Can do this since these are objects

        int x = 1;
        int y = 2;
        System.out.println(x == y);
    }
}
