package com.varunbkarmikanda.core.stringsandarrays.challenge2;

import java.util.Arrays;

public class StockAnalyzer {

    private double[] prices;

    public StockAnalyzer(double[] prices){
        this.prices = prices;
    }

    public Result displayAnalysis(){

        if(prices == null || prices.length == 0){
            return null;
        }

        double max = prices[0];
        double min = prices[0];
        double totalPrice = prices[0];
        int numberOfStocks = prices.length;

        for (int i = 1; i < numberOfStocks; i++) {

            if (prices[i] > max) max = prices[i];

            if (prices[i] < min) min = prices[i];

            totalPrice += prices[i];
        }

        double averagePrice = totalPrice / numberOfStocks;

        return new Result(max, min, totalPrice, averagePrice);
    }
}
