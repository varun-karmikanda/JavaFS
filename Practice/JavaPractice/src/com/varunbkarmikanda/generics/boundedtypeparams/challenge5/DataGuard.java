package com.varunbkarmikanda.generics.boundedtypeparams.challenge5;

public class DataGuard<T extends Number & Comparable<T>> {

    private T value;

    public DataGuard(T value){
        this.value = value;
    }

    public boolean isGreaterThan(T other){
        return this.value.compareTo(other) > 0;
    }

}
