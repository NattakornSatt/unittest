package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testPowerBasePositivePowerZero() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5,0);

        assertEquals(1, result);
    }

    @Test
    void testPowerBasePositivePowerOne() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5,1);

        assertEquals(5, result);
    }

    @Test
    void testPowerBasePositivePowerNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5,-1);

        assertEquals(-1, result);
    }

    @Test
    void testPowerBaseNegativePowerZero() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-5,0);

        assertEquals(1, result);
    }

    @Test
    void testPowerBaseNegativePowerOne() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-5,1);

        assertEquals(-5, result);
    }

    @Test
    void testPowerBaseZeroPowerPositive() {
        Calculator calculator = new Calculator();
        int result = calculator.power(0,5);

        assertEquals(0, result);
    }

    @Test
    void testPowerBaseZeroPowerNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.power(0,-5);

        assertEquals(-1, result);
    }

    @Test
    void testPowerBaseNegativePowerNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.power(-2,-5);

        assertEquals(-1, result);
    }

    @Test
    void testPowerBaseZeroPowerZero() {
        Calculator calculator = new Calculator();
        int result = calculator.power(0,0);

        assertEquals(1, result);
    }


}
