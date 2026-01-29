package com.varunbkarmikanda.genericstypes.genericclass.withgenerics;

public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
