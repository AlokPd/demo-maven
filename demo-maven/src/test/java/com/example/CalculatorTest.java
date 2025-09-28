package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add_twoNumbers() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void subtract_twoNumbers() {
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    void multiply_twoNumbers() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    void divide_twoNumbers() {
        assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void divide_byZero_throws() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }
}
