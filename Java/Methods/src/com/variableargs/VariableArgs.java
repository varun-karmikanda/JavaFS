package com.variableargs;

public class VariableArgs {
    public static void main(String[] args) {
        System.out.println(sum(12, 454, 1329));
        System.out.println(sum());
    }

    public static int sum(int ... a){
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return sum;
    }
}
