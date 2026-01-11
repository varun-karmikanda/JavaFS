package com.varunbkarmikanda.core.test.warehouse1;

public class Test {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();

        try{
            for (int i = 1; i <= 6 ; i++) {
                Product p = new Product("Item " + i, ProductCategory.FOOD);
                wareHouse.addItem(p);
            }
        } catch (StorageFullException e) {
            System.out.println(e);
        } finally {
            System.out.println("Inventory count: "+ WareHouse.currentCount + ((WareHouse.currentCount == WareHouse.MAX_CAPACITY) ? " (Full)" : ""));
        }
    }
}
