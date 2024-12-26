package FokinTests;

import allclasses.fokin.FokinClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FokinTests {

    @Test
    public void testPrintMessage() {
        FokinClass fc = new FokinClass();
        fc.printMessage("Hello, Fokin!");
    }

    @Test
    public void testCalculateSum() {
        FokinClass fc = new FokinClass();
        assertEquals(5, fc.calculateSum(2, 3));
        assertEquals(0, fc.calculateSum(0, 0));
        assertEquals(-1, fc.calculateSum(-1, 0));
    }

    @Test
    public void testGenerateRandomArray() {
        FokinClass fc = new FokinClass();
        int[] randomArray = fc.generateRandomArray(5, 10);

        assertEquals(5, randomArray.length); // Проверяем, что размер массива равен 5
        for (int num : randomArray) {
            assertTrue(num >= 0 && num < 10); // Проверяем, что все числа в диапазоне [0, 10)
        }
    }
}
