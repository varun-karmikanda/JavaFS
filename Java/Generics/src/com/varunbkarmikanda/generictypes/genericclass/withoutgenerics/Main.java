package com.varunbkarmikanda.generictypes.genericclass.withoutgenerics;

public class Main {
    public static void main(String[] args){
        Box box = new Box();
        box.setValue(1);
        int value = (Integer) box.getValue();
//        String value = (String) box.getValue();
        System.out.println(value);
    }
}
