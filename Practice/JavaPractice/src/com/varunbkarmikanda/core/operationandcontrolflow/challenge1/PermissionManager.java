package com.varunbkarmikanda.core.operationandcontrolflow.challenge1;

public class PermissionManager {

    public int grantPermission(int current, Permissions newBit){
        return current | newBit.getBitmask();
    }

    public boolean hasPermission(int current, Permissions newBit){
        System.out.println("Get bitmask: " +newBit.getBitmask());
        return (current & newBit.getBitmask()) != 0;
    }

    public void printBits(int value){
        String binary = String.format("%4s", Integer.toBinaryString(value)).replace(" ", "0");
        System.out.println("Decimal: " +value+ " | Binary: "+binary);
    }
}
