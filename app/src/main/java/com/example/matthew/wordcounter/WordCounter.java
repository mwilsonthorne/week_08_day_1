package com.example.matthew.wordcounter;

public class WordCounter {

    public static int countWords(String words){

        String[] word = words.split("\\s+");
        return word.length;
    }

}
