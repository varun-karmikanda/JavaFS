package com.varunbkarmikanda.core.stringsandarrays.challenge2;

public class Result {

    private double maxPrice;
    private double minPrice;
    private double totalPrice;
    private double averagePrice;

    public Result(double maxPrice, double minPrice, double totalPrice, double averagePrice) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.totalPrice = totalPrice;
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Result{" +
                "\n\tmaxPrice=" + maxPrice + "," +
                "\n\tminPrice=" + minPrice + "," +
                "\n\ttotalPrice=" + totalPrice + "," +
                "\n\taveragePrice=" + averagePrice + "," +
                "\n}";
    }
}
