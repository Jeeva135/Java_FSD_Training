package com.stackroute.commonjavaclasses;

public class ISBNValidator {
    public int validateISBNNumber(String invalidValue) throws NumberFormatException{
        try {
            if ( invalidValue==null || invalidValue=="")
                return -1;
            long value = Long.parseLong(invalidValue);
            if (invalidValue.length() != 10) {
                return 0;
            } else {
                long result=0,i=1;
                while (value != 0) {
                    long rem = value % 10;
                    result = result + (rem * i);
                    i++;
                    value = value / 10;

                }
                if (result % 11 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }catch (NumberFormatException e){
            throw e;
        }
    }
}
