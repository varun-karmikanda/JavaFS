package com.varunbkarmikanda.math;

public class Maths {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int c = -55;
        int abs = Math.abs(c);
//        System.out.println(abs);

        double d = 1.63;
        double ceil = Math.ceil(d);
        double floor = Math.floor(d);
//        System.out.println(ceil);
//        System.out.println(floor);

        double round = Math.round(d);
//        System.out.println(round);
//        System.out.println(Math.round(0.5));

        int e = 256;
        double sqrt = Math.sqrt(e);
//        System.out.println(sqrt);

        double power = Math.pow(16, 2);
//        System.out.println(power);

        double logE = Math.log(100);
        double log10 = Math.log10(100);
//        System.out.println(logE);
//        System.out.println(log10);
//        System.out.println(Math.log1p(100));

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.random());  // returns value from 0.0 < value < 1
        System.out.println((int) (Math.random() * 11));

        System.out.println(Math.nextAfter(10, 5));
        System.out.println(Math.nextDown(10));
        System.out.println(Math.nextUp(10));


    }
}
