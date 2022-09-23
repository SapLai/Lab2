package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    public Calculator underTest;

    @BeforeEach
    void setup() {
        underTest = new Calculator();
    }

    @Test
    @DisplayName("Should successfully sum two numbers")
    void test1() {
        final int first = 5;
        final int second = 8;
        final int expectedResult = 13;

        final int actualResult = underTest.sum(first, second);
        System.out.println("a");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should successfully subtract first number from the second one")
    void test2() {
        final int first = 5;
        final int second = 8;
        final int expectedResult = -3;

        final int actualResult = underTest.subtract(first, second);

        assertEquals(expectedResult, actualResult);
    }


}