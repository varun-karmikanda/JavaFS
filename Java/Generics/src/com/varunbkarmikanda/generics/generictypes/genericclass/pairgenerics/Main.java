package com.varunbkarmikanda.generics.generictypes.genericclass.pairgenerics;

public class Main {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("Roll No", 67);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
