package com.mariia.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);

        int expected2 = 150;
        int result2 = calculator.add(100, 50);
        assertEquals(expected2, result2);
    }

        @Test
        void multiplication() {
            Calculator calculator = new Calculator();
            double expected3 = 12;
            double result3 = calculator.multiplication(3, 4);
            assertEquals(expected3, result3);
        }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        double expected4 = 3;
        double result4 = calculator.division(15, 5);
        assertEquals(expected4, result4);
    }

    @Test
    void squaring() {
        Calculator calculator = new Calculator();
        int expected5 = 27;
        int result5 = calculator.squaring(3, 3);
        assertEquals(expected5, result5);
    }
}