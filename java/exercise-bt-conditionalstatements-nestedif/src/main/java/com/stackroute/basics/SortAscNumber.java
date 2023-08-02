package com.stackroute.basics;


import java.util.Scanner;

public class SortAscNumber {

    public static void main(String[] args) {
        new SortAscNumber().getNumbers();
    }

    //get the numbers from user through console
    public void getNumbers() {
        Scanner scan= new Scanner(System.in);
        int firstNum= scan.nextInt();
        int secondNum=scan.nextInt();
        int thirdNum=scan.nextInt();
        int fourthNum= scan.nextInt();
        System.out.println(numberSorter(firstNum,secondNum,thirdNum,fourthNum));

    }

    //logic to sort the numbers
    public String numberSorter(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        String result="Sorted:{";
        int firstPlace=0,secondPlace=0,thirdPlace=0,fourthPlace=0;

        //To get smallest number
        if (firstNumber<=secondNumber && firstNumber<=thirdNumber && firstNumber<=fourthNumber) {
            firstPlace = firstNumber;
        } else if (secondNumber<=firstNumber && secondNumber<=thirdNumber && secondNumber<=fourthNumber) {
            firstPlace=secondNumber;
        } else if (thirdNumber<=firstNumber && thirdNumber<=secondNumber && thirdNumber<=fourthNumber) {
            firstPlace=thirdNumber;
        } else if (fourthNumber<=firstNumber && fourthNumber<=secondNumber && fourthNumber<=thirdNumber) {
            firstPlace=fourthNumber;
        }
        //To get the largest number
        if (firstNumber>=secondNumber && firstNumber>=thirdNumber && firstNumber>=fourthNumber) {
            fourthPlace = firstNumber;
        } else if (secondNumber>=firstNumber && secondNumber>=thirdNumber && secondNumber>=fourthNumber) {
            fourthPlace=secondNumber;
        } else if (thirdNumber>=firstNumber && thirdNumber>=secondNumber && thirdNumber>=fourthNumber) {
            fourthPlace=thirdNumber;
        } else if (fourthNumber>=firstNumber && fourthNumber>=secondNumber && fourthNumber>=thirdNumber) {
            fourthPlace=fourthNumber;
        }
        int storeNum1=firstPlace,storeNum2=fourthPlace;

        if (firstNumber!=firstPlace && firstNumber!=fourthPlace) {
            storeNum1 = firstNumber;
            if (secondNumber!=firstPlace && secondNumber!=fourthPlace)
                storeNum2=secondNumber;
            else if (thirdNumber!=firstPlace && thirdNumber!=fourthPlace) {
                storeNum2 = thirdNumber;
            }
            else if(fourthNumber!=firstPlace && fourthNumber!=fourthPlace) {
                storeNum2 = fourthNumber;
            }
        }
        else if (secondNumber!=firstPlace && secondNumber!=fourthPlace){
            storeNum1=secondNumber;
            if (thirdNumber!=firstPlace && thirdNumber!=fourthPlace){
                storeNum2=thirdNumber;
            } else if (fourthNumber!=firstPlace && fourthNumber!=fourthPlace) {
                storeNum2=fourthNumber;
            }
        }
        else if (thirdNumber!=firstPlace && thirdNumber!=fourthPlace){
            storeNum1=thirdNumber;
            if (fourthNumber!=firstPlace && fourthNumber!=fourthPlace){
                storeNum2=fourthNumber;
            }

        }
        //System.out.println(storeNum1+" "+storeNum2);
        if (storeNum1<storeNum2) {
            secondPlace = storeNum1;
            thirdPlace=storeNum2;
        }
        else {
            secondPlace=storeNum2;
            thirdPlace = storeNum1;
        }

        result=result+firstPlace+","+secondPlace+","+thirdPlace+","+fourthPlace+"}";
        return result;

    }

}