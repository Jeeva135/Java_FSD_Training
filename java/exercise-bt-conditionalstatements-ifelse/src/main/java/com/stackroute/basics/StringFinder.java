package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        StringFinder stringFinder=new StringFinder();
        stringFinder.getInput();

    }

    public String getInput() {
        String searchString=scanner.nextLine();
        String firstString=scanner.nextLine();
        String secondString=scanner.nextLine();
        int res=findString(searchString,firstString,secondString);
        displayResult(res);
        scanner.close();
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if (result==-1)
            System.out.println("Empty string or null");
        if (result==1)
            System.out.println("Found as expected");
        if (result==0)
            System.out.println("Not found");
    }

    public int findString(String searchString, String firstString, String secondString) {
        if (searchString==null || firstString==null || secondString==null)
            return -1;
        if (searchString.isEmpty() || firstString.isEmpty() || secondString.isEmpty())
            return -1;
        else {
            int a=searchString.indexOf(firstString);
            int b=searchString.indexOf(secondString);

            if (a<b && a!=-1 && b!=-1)
                return 1;
            else
                return 0;
        }
    }
    public void closeScanner() {
        scanner.close();
    }
}
