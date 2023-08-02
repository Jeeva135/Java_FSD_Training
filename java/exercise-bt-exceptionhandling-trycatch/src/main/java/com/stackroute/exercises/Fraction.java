package com.stackroute.exercises;


public class Fraction {
    //Write logic to calculate the fraction and return as a String
    public String fractionCalculator(int firstNumber, int secondNumber) {
        try{
            int result= firstNumber/secondNumber;
            return ""+result;
        }catch (ArithmeticException e) {
            return e.toString();
        }
    }
}
