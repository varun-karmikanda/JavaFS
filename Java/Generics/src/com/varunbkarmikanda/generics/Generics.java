package com.varunbkarmikanda.generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("world");

//        list.add(1);

        String string = list.get(0);
        String string1 = list.get(1);

    }
}
