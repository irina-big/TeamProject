package GadzhievTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Important: Import this for assertEquals and assertThrows

import allclasses.gadzhiev.GadzhievClass;

public class GadzhievTest {

    @Test
    void testAdd() {
        GadzhievClass calculator = new GadzhievClass();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtract() {
        GadzhievClass calculator = new GadzhievClass();
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(-5, calculator.subtract(1, 6));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        GadzhievClass calculator = new GadzhievClass();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 25));
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    void testDivide() {
        GadzhievClass calculator = new GadzhievClass();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 25));
        assertEquals(1, calculator.divide(5, 5));

        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}