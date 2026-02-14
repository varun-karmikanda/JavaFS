package com.varunbkarmikanda.generics.typesafety.challenge1;

public class Main {
    public static void main(String[] args){
        DataEnvelope<Double> dataDouble= new DataEnvelope<>(67.67);
        System.out.println(dataDouble);

        DataEnvelope<String> dataString = new DataEnvelope<>("Varun");
        System.out.println(dataString);

    }
}
