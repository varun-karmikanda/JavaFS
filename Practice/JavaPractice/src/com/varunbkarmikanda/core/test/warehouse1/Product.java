package com.varunbkarmikanda.core.test.warehouse1;

public class Product implements Trackable{

    private final String name;

    private final ProductCategory category;

    public Product(String name, ProductCategory category){
        this.name = name;
        this.category = category;
    }


    @Override
    public void getTrackableInfo() {
        System.out.println("Product name: " + this.name + " | Category: " + this.category);
    }

    public String getName(){
        return name;
    }
}
