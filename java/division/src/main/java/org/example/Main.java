package org.example;

public class Main {
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return dividend / divisor;
        }
    }
}