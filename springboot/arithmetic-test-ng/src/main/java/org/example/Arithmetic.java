package org.example;

import java.util.List;

public class Arithmetic {
    public int add(int a,int b){
        return  a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if (b==0){
            throw new ArithmeticException("Not Possible");
        }
        return a/b;
    }

    public List <Integer> printOddNumbers(List <Integer> num){
        return num.stream().filter( n -> n%2!=0).toList();
    }
}
