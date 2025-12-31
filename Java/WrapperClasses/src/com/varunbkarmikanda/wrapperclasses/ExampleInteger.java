package com.varunbkarmikanda.wrapperclasses;

public class ExampleInteger {


    public static void main(String[] args) {
        Integer a = 1;
        fun(a);
        System.out.println(a);
        System.out.println("a: "+a.hashCode());
    }

    public static void fun(Integer b){
        b = 2;
        System.out.println("b: "+b.hashCode());
    }
}
