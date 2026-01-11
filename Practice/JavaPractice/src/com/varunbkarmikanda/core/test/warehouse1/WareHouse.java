package com.varunbkarmikanda.core.test.warehouse1;

public class WareHouse {

    public static int currentCount;

    public static final int MAX_CAPACITY = 5;

    public void addItem(Product p) throws StorageFullException {
        if(currentCount >= MAX_CAPACITY) {
            throw new StorageFullException("Warehouse storage full!", p.getName(), currentCount);
        }
        currentCount++;
        System.out.println("Item added to warehouse!");
        p.getTrackableInfo();
    }

}
