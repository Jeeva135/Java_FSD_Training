package org.example;

import java.util.Comparator;

public class ReverseOrderComparator implements Comparator<Word> {
    public int compare(Word o1, Word o2) {
        return o2.getWord().compareTo(o1.getWord());
    }
}

