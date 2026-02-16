package com.varunbkarmikanda.generics.boundedtypeparams.challenge1;

public class MathBox<T extends Number> {

    private T value;

    public MathBox(T value){
        this.value = value;
    }

    public double squareValue(){
        return value.doubleValue() * value.doubleValue();
    }
}
