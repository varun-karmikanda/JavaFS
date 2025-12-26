package com.varunbkarmikanda.statickeyword.test;

public class Utils {

    // Frequently use methods in utility class

    public static int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static int min(int a, int b){
        if(a < b) return a;
        return b;
    }

    public static String trimAndUpperCase(String str){
        if(str != null) return str.trim().toUpperCase();
        return "";
    }
}
