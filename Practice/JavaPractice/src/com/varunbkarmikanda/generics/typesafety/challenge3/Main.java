package com.varunbkarmikanda.generics.typesafety.challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringLengthCounter counter = new StringLengthCounter();
        System.out.println(counter.transform("Generics"));

        List<Double> list = Arrays.asList(1.1, 2.2, 3.3);
        ListFirstElement<Double> firstElement = new ListFirstElement<>();
        System.out.println(firstElement.transform(list));
    }
}
