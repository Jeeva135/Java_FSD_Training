package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class WordList {

    List<Word> addToList(ArrayList<String> list)
    {
        List<Word> wordList = new ArrayList<Word>();
        int count = 0;
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(list);
        for (String str:treeSet
        ) {
            count = Collections.frequency(list,str);
            wordList.add(new Word(str,count));
        }
        return wordList;
    }
    void showWordList(ArrayList<Word> wordList){
        for (Word w:wordList
        ) {
            System.out.println("word "+w.getWord()+" occurs"+w.getCount()+" times");
        }

    }
    void reverse(ArrayList<Word> wordList){
        Collections.sort(wordList,new ReverseOrderComparator());
        for (Word w:wordList
        ) {
            System.out.println("word "+w.getWord()+" occurs"+w.getCount()+" times");
        }
    }
    void showFrequentWord(ArrayList<Word> wordList){
        Collections.sort(wordList,new FrequencyComparator());
        for (Word w:wordList
        ) {
            System.out.println("word "+w.getWord()+" occurs"+w.getCount()+" times");
        }
    }


}
