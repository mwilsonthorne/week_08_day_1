package com.example.matthew.wordcounter;

import java.util.ArrayList;

public class WordCounter {

    public static int countWords(String words){

        String[] word = words.split(" ");
        return word.length;
    }

}
