package com.varunbkarmikanda.genericstypes.boundedtypeparams.multipleboundation;

public class Test {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(67);

        Box<MyNumber> box = new Box<>(myNumber);

        box.display();
    }
}
