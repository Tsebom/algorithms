package org.tsebom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void testAdd() {
        calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2,2));
    }
    @Test
    public void testSub() {
        calculator = new Calculator();
        Assertions.assertEquals(0, calculator.sub(2,2));
    }
}