package com.varunbkarmikanda.core.operationandcontrolflow.challenge1;

public enum Permissions {
    READ(1 << 0),
    WRITE(1 << 1),
    EXECUTE(1 << 2),
    DELETE(1 << 3);

    private final int bitmask;

    Permissions(int bitmask){
        this.bitmask = bitmask;
    }

    public int getBitmask() {
        return bitmask;
    }
}
