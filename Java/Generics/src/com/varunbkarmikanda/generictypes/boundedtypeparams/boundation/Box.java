package com.varunbkarmikanda.generictypes.boundedtypeparams.boundation;

public class Box<N extends Number> {
    private N value;

    public void setValue(N value){
        this.value = value;
    }

    public N getValue(){
        return value;
    }
}
