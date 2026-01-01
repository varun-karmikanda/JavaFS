package com.varunbkarmikanda.core.javabasics.challenge1;

public class Electronics {

    private String itemName;

    private int quantity;

    private double price;

    private boolean isInStock;

    private EnergyRating energyRating;

    public Electronics(String itemName, int quantity, double price, boolean isInStock, EnergyRating energyRating) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.isInStock = isInStock;
        this.energyRating = energyRating;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "\n\titemName=" + itemName + ',' +
                "\n\tquantity=" + quantity +
                "\n\tprice=" + price +
                "\n\tisInStock=" + isInStock +
                "\n\tenergyRating=" + energyRating +
                "\n}";
    }

    public double totalCost(){
        return getQuantity() * getPrice();
    }

}
