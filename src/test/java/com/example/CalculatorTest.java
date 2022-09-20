package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("Should successfully multiply two numbers")
    void test3() {
        final int first = 5;
        final int second = 8;
        final int expectedResult = 40;

        final int actualResult = underTest.multiply(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should produce 0 when one of the numbers is equal to 0")
    void test4() {
        final int first = 5;
        final int second = 0;
        final int expectedResult = 1;

        final int actualResult = underTest.multiply(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should successfully divide two numbers")
    void test5() {
        final int first = 40;
        final int second = 8;
        final int expectedResult = 8;

        final int actualResult = underTest.divide(first, second);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Should throw exception when second number is equal to 0")
    void test6() {
        final int first = 5;
        final int second = 0;

        assertThrows(IllegalArgumentException.class, () -> underTest.divide(first, second));
    }

}