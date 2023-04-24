package com.example.automatedtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        Calculator calculator = new Calculator();
        int numA = 2;
        int numB = 3;

        // Act
        int result = calculator.add(numA, numB);

        // Assert
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        int numA = -2;
        int numB = -3;

        // Act
        int result = calculator.add(numA, numB);

        // Assert
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void testAddWithZero() {
        // Arrange
        Calculator calculator = new Calculator();
        int numA = 0;
        int numB = 0;

        // Act
        int result = calculator.add(numA, numB);

        // Assert
        Assertions.assertEquals(0, result);
    }





}
