package com.varunbkarmikanda.core.javabasics.challenge2;

public class C1_BankAccount {

    private double accountBalance;

    private double monthlyInterest;

    public C1_BankAccount(double accountBalance, double monthlyInterest){
        this.accountBalance = accountBalance;
        this.monthlyInterest = monthlyInterest;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getMonthlyInterest() {
        return monthlyInterest;
    }

    public double currentBalance(){
        return getAccountBalance() + (getAccountBalance() * getMonthlyInterest());
    }

    public boolean isDataLost(){
        double balance = currentBalance();
        long whole = (long) balance;
        return ((balance - whole) > 0.50);
    }

    @Override
    public String toString() {

        double balance = currentBalance();
        long whole = (long) balance;

        return "C1_BankAccount{" +
                "\n\taccountBalance=" + this.accountBalance + "," +
                "\n\tmonthlyInterest=" + this.monthlyInterest + "," +
                "\n\tbalanceAfterInterest=" + balance + "," +
                "\n\twholeDollars=" + whole + "," +
                "\n\tdataLoss=" + isDataLost() + "(" + (balance - whole) + ")" +
                "\n}";
    }
}
