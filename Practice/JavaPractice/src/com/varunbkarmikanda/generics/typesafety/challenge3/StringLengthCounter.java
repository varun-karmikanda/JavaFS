package com.varunbkarmikanda.generics.typesafety.challenge3;

public class StringLengthCounter implements Transformer<String, Integer>{
    @Override
    public Integer transform(String input) {
        return input.length();
    }
}
