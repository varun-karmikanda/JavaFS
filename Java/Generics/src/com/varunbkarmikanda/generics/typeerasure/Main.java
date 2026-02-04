package com.varunbkarmikanda.generics.typeerasure;

public class Main {
    public static void main(String[] args) {
//        Box<String> box = new Box<>();
//        box.setValue("Hello");
//        String value = box.getValue();

        Box box = new Box();
        box.setValue("Hello");
        String value = (String) box.getValue();
    }
}
