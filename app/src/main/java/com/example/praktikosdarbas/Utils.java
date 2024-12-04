package com.example.praktikosdarbas;

public class Utils {

    public static int countWords(String inputText) {
        if (inputText == null || inputText.trim().isEmpty()) {
            return 0;
        }

        String[] words = inputText.trim().split("[^a-zA-Z0-9]+");
        int wordCount = 0;

        // Count words that are not empty.
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int countCharacters(String inputText) {
        if (inputText == null) {
            return 0;
        }

        return inputText.length();
    }
}
