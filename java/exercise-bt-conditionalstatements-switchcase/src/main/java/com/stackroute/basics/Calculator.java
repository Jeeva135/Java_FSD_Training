package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        char choice='y';
        String result;
        do {
            int firstValue = scan.nextInt();
            int secondValue = scan.nextInt();
            int operator = scan.nextInt();
            choice=scan.next().charAt(0);
            result=calculate(firstValue, secondValue, operator);
        }while(choice!='n');
        System.out.println(result);

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        switch(operator){
            case 1:
                return (firstValue+" + "+secondValue +" = " +(firstValue+secondValue));
            case 2:
                return (firstValue+" - "+secondValue +" = " +(firstValue-secondValue));
            case 3:
                return (firstValue+" * "+secondValue +" = " +(firstValue*secondValue));
            case 4:
                if (secondValue!=0)
                    return (firstValue+" / "+secondValue +" = " +(firstValue/secondValue));
                else
                    return "The divider (secondValue) cannot be zero";
            default:
                return "Entered wrong option "+ operator;
        }
        //return null;
    }
}
