package com.example.lab2;

import com.example.lab2.utils.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementsCalculatoWordUnitTest {

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getCharsWordstIsCalled_Then_NullPointerExceptionIsThrown(){
        ElementsCalculator.getWordsCount(null);
    }

    @Test
    public void Given_EmptyString_When_getWordsCountIsCalled_Then_ReturnZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getWordsCountIsCalled_Then_ReturnZero(){
        final String givenString = "     "; // 5 spaces

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_getWordsCountIsCalled_Then_ReturnNumberOfWords(){
        final String givenString = "Hello   world tiutiuu:)";

        final int expectedResult = 3;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfSpacesAndSymbols_When_getWordsCountIsCalled_Then_ReturnNumberOfCalculatedWordsFromSymbols(){
        final String givenString = "  :) ?/  *-";

        final int expectedResult = 3;
        final int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}