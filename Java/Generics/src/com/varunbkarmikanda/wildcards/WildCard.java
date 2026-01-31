package com.varunbkarmikanda.wildcards;

import java.util.ArrayList;

public class WildCard {

    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<>();
//        list.add(2);
//        list.add("Hello");
    }

    public void display(ArrayList<?> list){
        for (Object o: list){
            System.out.println(o);
        }
    }

    public <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination){
        for(T item: source){
            destination.add(item);
        }
    }
}
