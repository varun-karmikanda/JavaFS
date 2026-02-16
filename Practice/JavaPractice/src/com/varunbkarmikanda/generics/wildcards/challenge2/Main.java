package com.varunbkarmikanda.generics.wildcards.challenge2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static double sumOfList(List<? extends Number> list){
        double total = 0.0;
        for (Number item: list){
            total += item.doubleValue();
        }
        return total;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 20);
        double integerResult = sumOfList(list);
        System.out.println("Integer: " + integerResult);

        List<Double> list1 = Arrays.asList(10.5, 20.5);
        double doubleResult = sumOfList(list1);
        System.out.println("Double+: " + doubleResult);
    }
}
