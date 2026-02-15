package com.varunbkarmikanda.generics.typesafety.challenge4;

public class Main {
    public static void main(String[] args){
        MathBox<Integer> integerMathBox = new MathBox<>(67);
        System.out.println(integerMathBox.squareValue());

        MathBox<Double> doubleMathBox = new MathBox<>(67.67);
        System.out.println(doubleMathBox.squareValue());

//        MathBox<String> test = new MathBox<>("Test");

    }
}
