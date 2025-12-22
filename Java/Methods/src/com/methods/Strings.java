package com.methods;

public class Strings {
    public static void main(String[] args) {
        String name = "varun";
//        System.out.println(System.identityHashCode(name));
        System.out.println(upper(name));
        System.out.println(name);
    }

    public static String upper(String str){
//        System.out.println(System.identityHashCode(str));
        return str.toUpperCase();
    }
}
