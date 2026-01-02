package com.varunbkarmikanda.core.stringsandarrays.challenge2;

public class Test {
    public static void main(String[] args) {

        new Test().run();

    }

    public void run(){
        double[] prices = {150.5, 148.2, 155.0, 140.0, 162.4, 158.9, 151.2};

//        double[] prices = {};

        StockAnalyzer stockAnalyzer = new StockAnalyzer(prices);
        Result result = stockAnalyzer.displayAnalysis();
        System.out.println(result);
    }
}
