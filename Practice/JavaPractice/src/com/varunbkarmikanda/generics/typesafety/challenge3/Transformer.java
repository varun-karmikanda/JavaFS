package com.varunbkarmikanda.generics.typesafety.challenge3;

public interface Transformer<I, O> {
    O transform(I input);
}
