package BaranovTest;

import allclasses.Baranov.Baranov;
import org.junit.Test;
import static org.junit.Assert.*;

public class BaranovTest {

    // Тесты для сложения
    @Test
    public void testAddPositiveNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(8, baranov.add(5, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(-8, baranov.add(-5, -3));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(2, baranov.add(5, -3));
    }

    // Тесты для умножения
    @Test
    public void testMultiplyPositiveNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(15, baranov.multiply(5, 3));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(15, baranov.multiply(-5, -3));
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(-15, baranov.multiply(5, -3));
    }
}
