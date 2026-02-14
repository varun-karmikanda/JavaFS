package com.varunbkarmikanda.generics.typesafety.challenge1;

public class DataEnvelope<T> {
    private T data;

    public DataEnvelope(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString(){
        return "DATA: " + data;
    }
}
