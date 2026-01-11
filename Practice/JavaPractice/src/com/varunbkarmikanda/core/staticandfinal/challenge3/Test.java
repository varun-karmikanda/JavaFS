package com.varunbkarmikanda.core.staticandfinal.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    class Product{

        private String category;

        private String name;

        public Product(String category, String name){
            this.category = category;
            this.name = name;
        }

        public String getCategory(){
            return category;
        }

        public String getName() {
            return name;
        }
    }

    public void manageProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("ELECTRONICS", "LAPTOP"));
        products.add(new Product("AUTOMOTIVE", "CAR"));
        products.add(new Product("CLOTHING", "LAPTOP"));
        products.add(new Product("ELECTRONICS", "SMARTPHONE"));
        products.add(new Product("ELECTRONICS", "TV"));

        products.stream()
                .filter(p -> p.getCategory().equals("ELECTRONICS"))
                .forEach(p -> System.out.println(p.getName()));

        for(Product p: products){
            if(p.getCategory().equals("ELECTRONICS")){
                System.out.println(p.getName());
            }
        }


    }

    public static void main(String[] args) {
        new Test().manageProducts();
    }

}
