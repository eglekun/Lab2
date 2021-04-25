package com.example.lab2.utils;

public class ElementsCalculator {
    public static int getCharsCount(String inputText){
        return inputText.length();
    }
    public static int getWordsCount(String inputText) {
        String words = inputText.trim();
        if (words.isEmpty())  return 0;
        return words.split("\\s+").length; // separate string around spaces
    }
}
