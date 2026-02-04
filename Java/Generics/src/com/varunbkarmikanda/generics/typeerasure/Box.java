package com.varunbkarmikanda.generics.typeerasure;

// Here the type gets erased after compilation

//public class Box<T>{
//    private T value;
//
//    public T getValue(){
//        return value;
//    }
//
//    public void setValue(T value){
//        this.value = value;
//    }
//}

// Type erased
public class Box{
    private Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}

// When extends a Number
//class Boxxx<T extends Number>{
//    private T value;
//
//    public T getValue(){
//        return value;
//    }
//
//    public void setValue(T value){
//        this.value = value;
//    }
//}

class Boxx{
    private Number value;

    public Number getValue(){
        return value;
    }

    public void setValue(Number value){
        this.value = value;
    }
}