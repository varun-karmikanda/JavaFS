package com.varunbkarmikanda.genericstypes.genericclass.withgenerics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        Integer value = box.getValue();
        System.out.println(value);
    }
}
