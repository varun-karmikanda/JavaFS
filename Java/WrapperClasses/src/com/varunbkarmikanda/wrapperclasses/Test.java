package com.varunbkarmikanda.wrapperclasses;

public class Test {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        System.out.println(Integer.min(a, b));
        System.out.println(Integer.max(a, b));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(55));

        String str = "6251";
        Integer i = Integer.valueOf(str);
        System.out.println(i + 1);
        System.out.println(str + 1);

        // Why Wrapper classes?
        // due to the limitation of the primitive types.
        // They can't be used in List or other Collections.

    }
}
