package com.varunbkarmikanda.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WC {

    public static void main(String[] args){
//        WC.sum(Arrays.asList(2,1));

        List<? super Integer> list = Arrays.asList(1, 2, 3);
        list.add(67);
        list.add(null);

    }

    // Upper bound
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    // Lower bound
    public static void printNumbers(List<? super Integer> list){
        for (Object o: list){
            System.out.println(o);
        }
    }

}
