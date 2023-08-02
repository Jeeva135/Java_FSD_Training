package com.stackroute.basics;


import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int [] arr=new int [n];
        for (int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(findAverage(arr));
    }
    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        String result;
        int sum=0;
        if (inputArray.length==0)
        {
            return "Empty array";
        }
        for (int i:inputArray){
            if (i<0){
                return "Give proper positive integer values";
            }else{
                sum=sum+i;
            }
        }
        result="The average value is: "+sum/inputArray.length;
        return result;
    }
}
