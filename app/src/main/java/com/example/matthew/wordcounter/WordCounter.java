package com.example.matthew.wordcounter;

public class WordCounter {

    public static int countWords(String words){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = words.length() - 1;

        for (int i = 0; i < words.length(); i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(words.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(words.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(words.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
