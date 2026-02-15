package com.varunbkarmikanda.generics.typesafety.challenge3;

import java.util.List;

public class ListFirstElement<T> implements Transformer<List<T>, T> {
    @Override
    public T transform(List<T> input) {
        return input.get(0);
    }
}
