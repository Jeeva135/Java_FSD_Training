package com.stackroute.commonjavaclasses;

import java.sql.Wrapper;

public class WrapperClassConvert {

    //write logic to determine and convert given primitive type to its wrapper class and return result
    public Object convertToWrapper(Object input) {

        if(input instanceof Integer){
            Integer res = (Integer) input;
            return res;
        }
        else if(input instanceof Float){
            Float res = (Float) input;
            return res;
        }
        else if(input instanceof Double){
            Double res = (Double) input;
            return res;
        }
        else if(input instanceof Byte){
            Byte res = (Byte) input;
            return res;
        }
        else if(input instanceof Boolean){
            Boolean res = (boolean) input;
            return res;
        }
        else if(input instanceof Short){
            Short res = (Short) input;
            return res;
        }
        else if(input instanceof Long){
            Long res = (Long) input;
            return res;
        }
        else if(input instanceof Character){
            Character res = (Character) input;
            return res;
        }
        else {
            return "Give proper primitive type as input";
        }
    }

}

