package com.references;

public class Test {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.name = "car";
//        System.out.println(a);
        Cat cat = makeCatUpperCase(a);
//        System.out.println(cat);
        System.out.println(cat.name);
        System.out.println(a.name);
    }

    public static Cat makeCatUpperCase(Cat cat){
//        System.out.println(cat);
        cat.name = cat.name.toUpperCase();
        return cat;
    }
}
