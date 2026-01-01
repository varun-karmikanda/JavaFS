package com.varunbkarmikanda.core.miscellaneous.challenge2;

public class Test {
    public static void main(String[] args) {
        ConfigLoader loader = new ConfigLoader();
        loader.loadConfig("src/com/varunbkarmikanda/core/challenge2/Challenge");
        loader.loadConfig("Challenge");
    }
}
