package com.xpadro.calculator;

import com.xpadro.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests")
public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test divide operation")
    public void testDivide() {
        assertAll(
                () -> assertEquals(3, calculator.divide(6, 2)),
                () -> assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0))
        );
    }

    @Test
    @DisplayName("TDD - Functionality in progress")
    @Disabled
    public void testTdd() {
        fail("in progress..");
    }


    @Nested
    @DisplayName("Calculator sum tests")
    class SumTest {
        @Test
        @DisplayName("Test sum operation with positive numbers")
        public void testSumPositive() {
            assertEquals(3, calculator.sum(1, 2));
        }

        @Test
        @DisplayName("Test sum operation with negative numbers")
        public void testSum() {
            assertEquals(-3, calculator.sum(-1, -2));
        }
    }
}
