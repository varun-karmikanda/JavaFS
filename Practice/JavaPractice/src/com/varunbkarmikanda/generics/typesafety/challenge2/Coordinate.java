package com.varunbkarmikanda.generics.typesafety.challenge2;

public class Coordinate<K, V> {
    private K key;
    private V value;

    public Coordinate(K key, V  value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public  V getValue(){
        return value;
    }

    public Coordinate<V, K> swap(){
        return new Coordinate<>(this.value, this.key);
    }

    public String toString(){
        return "<K> = " + key
            + "\n<V> = " + value;
    }
}
