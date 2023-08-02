package com.stackroute.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String phraseOne= scan.nextLine();
        String phraseTwo= scan.nextLine();
        System.out.println(new Anagram().checkAnagrams(phraseOne,phraseTwo));
    }
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        String result;
        if (phraseOne.isEmpty() || phraseTwo.isEmpty()){
            return "Give proper input not empty phrases";
        }else{
            char ch1[]=phraseOne.toCharArray();
            char ch2[]=phraseTwo.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2)){
                return "Given phrases are anagrams";
            }else{
                return "Given phrases are not anagrams";
            }
        }

    }
}
