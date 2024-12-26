package yakimovichTests;

import allclasses.yakimovich.YakimovichClass;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class CalculateTests {
    private YakimovichClass calculator = new YakimovichClass();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0,0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(2, 0));
        assertEquals(0, calculator.multiply(0, 3));
    }


    @Test
    public void testDivide() {
        assertEquals(3.5, calculator.divide(7, 2), 0.0001);
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }


    @Test
    public void testGenerateEvenNumbers() {
        List<Integer> evenNumbers = calculator.generateEvenNumbers(16);
        assertEquals(9, evenNumbers.size());
        assertTrue(evenNumbers.contains(0));
        assertTrue(evenNumbers.contains(2));
        assertTrue(evenNumbers.contains(6));
        assertTrue(evenNumbers.contains(8));
        assertTrue(evenNumbers.contains(14));
        assertTrue(evenNumbers.contains(16));
    }

    @Test
    public void testGenerateEvenNumbersZeroInput() {
        List<Integer> evenNumbers = calculator.generateEvenNumbers(0);
        assertEquals(1, evenNumbers.size());
        assertTrue(evenNumbers.contains(0));
    }
}
