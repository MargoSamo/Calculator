package com.mariia.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
    public void zeroDenominatorShouldThrowException() {
        assertThrows(ArithmeticException.class,
                () -> {
                    MyMath.divide(1, 0);
                });
    }
}
