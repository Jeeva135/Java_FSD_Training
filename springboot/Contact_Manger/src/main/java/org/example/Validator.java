package org.example;

public class Validator {

    private static final String NAME_REGEX="[a-zA-Z]+";
    private static final String PHONE_NUMBER_REGEX="[\\d{10}]+";

    private Validator(){}

    public static boolean isNameValid(String first_name,String last_name){
        return first_name!=null || last_name!=null
                || first_name.matches(NAME_REGEX) || last_name.matches(NAME_REGEX);
    }
    public static boolean isNumberValid(String number){
        return number!=null || number.matches(PHONE_NUMBER_REGEX);
    }
}
