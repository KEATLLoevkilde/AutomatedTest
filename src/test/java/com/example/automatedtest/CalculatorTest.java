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
}
