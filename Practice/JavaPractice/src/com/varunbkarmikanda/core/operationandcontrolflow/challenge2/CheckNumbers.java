package com.varunbkarmikanda.core.operationandcontrolflow.challenge2;

public class CheckNumbers {

    private int number;

    private int primeCount = 0;

    private int totalIterations = 0;

    public CheckNumbers(int number){
        this.number = number;
    }

    public void specialNumber(){
        for (int i = 2; i < number; i++) {

            if(primeCount == 15) {
                return;
            }

            totalIterations++;

            if(i % 5 == 0) continue;

            if(isPrime(i)){
                printPrime(i, totalIterations);
                primeCount++;
            }

        }

    }

    public boolean isPrime(int num){
        if(num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public void printPrime(int i, int totalIterations){
        System.out.printf("Prime: [%02d] | %02d\n", i, totalIterations);
//                System.out.println("Prime: ["+i+"] | "+totalIterations);
    }


    public int getRange() {
        return number;
    }

    public int getPrimeCount() {
        return primeCount;
    }

    public int getTotalIterations() {
        return totalIterations;
    }
}
