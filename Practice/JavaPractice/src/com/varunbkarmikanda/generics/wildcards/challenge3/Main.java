package com.varunbkarmikanda.generics.wildcards.challenge3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Object> myObject = new ArrayList<>();
        addNumbers(myObject);
        System.out.println("Object: " + myObject);

        List<Number> myNumber = new ArrayList<>();
        addNumbers(myNumber);
        System.out.println("Number: " + myNumber);
    }
}
