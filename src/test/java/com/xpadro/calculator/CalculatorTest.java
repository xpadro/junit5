package com.xpadro.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests")
public class CalculatorTest implements BaseTests {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        System.out.println("test before each");
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

    @ParameterizedTest
    @MethodSource("supplyInts")
    @DisplayName("Parameterized divisions test")
    public void testMultipleDivisions(int a, int b, int expected) {
        assertEquals(expected, calculator.divide(a, b));
    }

    static Stream<Arguments> supplyInts() {
        return Stream.of(Arguments.of(2, 1, 2), Arguments.of(10, 5, 2), Arguments.of(-8, -4, 2));
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
