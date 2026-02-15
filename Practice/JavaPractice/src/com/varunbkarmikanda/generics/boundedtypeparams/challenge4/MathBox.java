package com.varunbkarmikanda.generics.boundedtypeparams.challenge4;

public class MathBox<T extends Number> {

    private T value;

    public MathBox(T value){
        this.value = value;
    }

    public double squareValue(){
        return value.doubleValue() * value.doubleValue();
    }
}
