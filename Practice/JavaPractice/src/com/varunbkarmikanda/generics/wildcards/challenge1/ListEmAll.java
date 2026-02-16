package com.varunbkarmikanda.generics.wildcards.challenge1;

import java.util.Arrays;
import java.util.List;

public class ListEmAll {

    public void printAll(List<?> list){
        for (Object item: list){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {

        ListEmAll listEmAll = new ListEmAll();

        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        listEmAll.printAll(integerList);

        List<String> stringList = Arrays.asList("Varun", "B", "Karmikanda");
        listEmAll.printAll(stringList);
    }

}
