package com.stackroute.exception;

public class Account {

    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public int getAccountBalance() {
        return balance;
    }

    public double withdraw(int i) throws NegativeIntegerException, InsufficientFundException {
        double res = 0;
        try {
            res = balance - i;
            if (i < 0) {
                throw new NegativeIntegerException("Withdrawing amount less than zero");
            }
            if (i > balance) {
                throw new InsufficientFundException("Withdrawing amount greater than balance");
            }
        } catch (NegativeIntegerException | InsufficientFundException e) {
            throw e;
        }
        return res;
    }
}


