package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {
        new PhoneNumberValidator().getInput();

        //call the functions in the required sequence
    }

    public String getInput() {
        String phoneNo;
        phoneNo=scan.nextLine();

        int result=validatePhoneNumber(phoneNo);
        displayResult(result);
        return phoneNo;
    }

    public void displayResult(int result) {
        //displays the result
        if (result==0)
            System.out.println("Invalid");
        else if (result==1)
            System.out.println("Valid");
        else
            System.out.println("Empty String");
    }

    public int validatePhoneNumber(String input) {
        int count=0,flag=0;
        if (input==null || input.isEmpty())
            return -1;
        else {
            for (int i = 0; i < input.length(); i++) {

                if (Character.isDigit(input.charAt(i))) {
                    count++;
                } else if (input.charAt(i) == '-') {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }
        }
        if (count==10 && flag==0)
            return 1;
        else
            return 0;

    }
    public void closeScanner(){
        //close the Scanner object
        scan.close();
    }
}
