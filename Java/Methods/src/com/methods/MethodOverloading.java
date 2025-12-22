package com.methods;

public class MethodOverloading {

    // Method OVERLOADING: Function with same name with different TYPE of parameters or different NUMBER of parameters

    // Method SIGNATURE: method name + parameter list

    public static void main(String[] args) {

        System.out.println(sum(326, 561));
        System.out.println(sum(326.25F, 561.42F));
        System.out.println(sum(9987, 21, 327));

    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static float sum(float a, float b){
        return a + b;
    }

    // Not possible either need to change the signature(ie, the name or the params)
//    private static String sum(float a, float b){
//        return "Hello, world!";
//    }

    private static int sum(int a, int b, int c){
        return a + b;
    }

}
