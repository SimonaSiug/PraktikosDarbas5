package com.example.praktikosdarbas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UtilsClassUnitTest {

    @Test
    public void testCountWords_EmptyText() {
        String inputText = "";
        int expectedWordCount = 0;

        int actualWordCount = Utils.countWords(inputText);

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void testCountCharacters_EmptyText() {
        String inputText = "";
        int expectedCharCount = 0;

        int actualCharCount = Utils.countCharacters(inputText);

        assertEquals(expectedCharCount, actualCharCount);
    }

    @Test
    public void testCountWords_OnlySpaces() {
        String inputText = "     ";
        int expectedWordCount = 0;

        int actualWordCount = Utils.countWords(inputText);

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void testCountCharacters_OnlySpaces() {
        String inputText = "     ";
        int expectedCharCount = 5;

        int actualCharCount = Utils.countCharacters(inputText);

        assertEquals(expectedCharCount, actualCharCount);
    }

    @Test
    public void testCountWords_SpecialCharactersOnly() {
        String inputText = "!@#$%^&*()";
        int expectedWordCount = 0;

        int actualWordCount = Utils.countWords(inputText);

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void testCountCharacters_SpecialCharactersOnly() {
        String inputText = "!@#$%^&*()";
        int expectedCharCount = 10;

        int actualCharCount = Utils.countCharacters(inputText);

        assertEquals(expectedCharCount, actualCharCount);
    }

    @Test
    public void testCountWords_NormalText() {
        String inputText = "Hello World!";
        int expectedWordCount = 2;

        int actualWordCount = Utils.countWords(inputText);

        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    public void testCountCharacters_NormalText() {
        String inputText = "Hello World!";
        int expectedCharCount = 12;  

        int actualCharCount = Utils.countCharacters(inputText);

        assertEquals(expectedCharCount, actualCharCount);
    }
}
