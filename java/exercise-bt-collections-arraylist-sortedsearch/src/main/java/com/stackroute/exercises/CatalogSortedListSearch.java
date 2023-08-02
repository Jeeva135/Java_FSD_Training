package com.stackroute.exercises;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {

    List <String> result=new ArrayList<>();
    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
        if (unSortedCatalogList==null ) {
            return "The catalog list is null";
        }else if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }else if (unSortedCatalogList.contains("") || unSortedCatalogList.contains(null) || unSortedCatalogList.contains(" ")){
                    return "The catalog List contains empty or null or blank space as a value";
        }else{
            Collections.sort(unSortedCatalogList);
            result=unSortedCatalogList;
            return result.toString();
        }
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if (value==null || value.isEmpty() || value.isBlank()){
            return "Input is not accepted";
        }for (String element:result) {
            if (element.equalsIgnoreCase(value)) {
                return "Found: " + element;
            }
        }
        return "Not Found";
    }
}

