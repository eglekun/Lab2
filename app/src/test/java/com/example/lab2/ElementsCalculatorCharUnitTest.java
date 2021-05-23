package com.example.lab2;

import com.example.lab2.utils.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElementsCalculatorCharUnitTest {

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getCharsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        ElementsCalculator.getCharsCount(null);
    }

    @Test
    public void Given_EmptyString_When_getCharsCountIsCalled_Then_ReturnZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getCharsCountIsCalled_Then_ReturnCalculatedSpaces(){
        final String givenString = "     "; // 5 spaces

        final int expectedResult = 5;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TextString_When_getCharsCountIsCalled_Then_ReturnNumberOfSymbols(){
        final String givenString = "Hello   world tiutiuu:)";

        final int expectedResult = 23;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringOfSpacesAndSymbols_When_getCharsCountIsCalled_Then_ReturnNumberOfCalculatedSymbols(){
        final String givenString = "  :) ?/  *-";

        final int expectedResult = 11;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}