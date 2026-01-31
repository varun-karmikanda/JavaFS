package com.varunbkarmikanda.genericmethods;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b){
        switch (this){
            case ADD:{
                return a.doubleValue() + b.doubleValue();
            }
            case SUBTRACT:{
                return a.doubleValue() - b.doubleValue();
            }
            case MULTIPLY:{
                return a.doubleValue() * b.doubleValue();
            }
            case DIVIDE:{
                if (b.doubleValue() == 0) {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
                return a.doubleValue() / b.doubleValue();
            }
            default:{
                throw  new AssertionError("Unknown operation: " + this);
            }
        }
    }
}

public class MethodEnums {
    public static void main(String[] args) {
        double resultADD = Operation.ADD.apply(50, 67);
        double resultSUBTRACT = Operation.SUBTRACT.apply(50, 67);
        double resultMULTIPLY = Operation.MULTIPLY.apply(50, 67);
        double resultDIVIDE = Operation.DIVIDE.apply(50, 67);
//        double resultDIVIDEInvalid = Operation.DIVIDE.apply(50, 0);
        System.out.println(resultADD);
        System.out.println(resultSUBTRACT);
        System.out.println(resultMULTIPLY);
        System.out.println(resultDIVIDE);
//        System.out.println(resultDIVIDEInvalid);
    }
}
