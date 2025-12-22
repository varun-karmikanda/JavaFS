package com.varunbkarmikanda;

public class ArithmaticOperators {
    public static void main(String[] args) {
        // '+' operator

//        int a = 5;
//        double b = 11.67;
//        double c = a + b;
//        System.out.println(c);

//        float a = 11.67F;
//        long b = 123265;
//        float c = a + b;
//        System.out.println(c);

//        long a = 213121321;
//        long i = a * 23187;
//        System.out.println(i);

//        float a = 10.0F;
//        int b = 3;
//        float quotient = a / b;
//        System.out.println(quotient);

//        int a = 5;
//        int b = a - 5;
//        int c = a / b;
//        System.out.println(c);

        // Operator precedence
        // * / %
        // + -
        // Same level L -> R

        // Compound assignment
//        int a = 1;
////        a = a + 1;
//        a += 1;
//        System.out.println(a);

        // Compound assignment does implicit casting
//        byte a = 15;
////        a = (byte) (a + 5);
//        a += 5;
//        System.out.println(a);

        // Increment/Decrement operator
//        int a = 1;
//        a++;
//        System.out.println(a);
//        a--;
//        System.out.println(a);

//        int a = 1;
//        int b = a++ + a;
//        System.out.println(b);
//
//        int c = 1;
//        int d = ++c + c;
//        System.out.println(d);

//        int a = 1;
//        int c = ++a + --a;
//        System.out.println(c);

        double x = 1.5, y = 2.5, z = 3.5;
        double result = (x + y) * (z - y) / (x + z);
        System.out.println(result);

    }
}
