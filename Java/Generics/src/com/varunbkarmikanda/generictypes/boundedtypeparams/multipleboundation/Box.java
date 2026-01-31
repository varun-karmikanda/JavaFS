package com.varunbkarmikanda.generictypes.boundedtypeparams.multipleboundation;

//syntax
// class ClassName<T extends ClassName1 & interface1 & interface2 &...>{
// }

public class Box<T extends Number & Printable> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public void setItem(T item) {
        this.item = item;
    }
}
