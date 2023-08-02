package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "data/daffodils.txt"; // path to the input file
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordsInLine = line.split("[,\\s]+");
                words.addAll(Arrays.asList(wordsInLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        WordList wordList = new WordList();

        ArrayList<Word> wordCounts = (ArrayList<Word>) wordList.addToList(words);

        wordList.showWordList(wordCounts);

        System.out.println("\nReverse\n");
        wordList.reverse(wordCounts);

        System.out.println("\nFrequentWord\n");
        wordList.showFrequentWord(wordCounts);
    }

}