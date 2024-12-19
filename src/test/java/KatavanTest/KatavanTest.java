package KatavanTest;
import org.junit.Assert;
import org.junit.Test;
import allclasses.katavan.Katavan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class KatavanTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Katavan.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Katavan.factorial(5)); // 5! = 120
        assertEquals(720, Katavan.factorial(6)); // 6! = 720
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Katavan.factorial(1));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Katavan.factorial(-1);
        });
    }
}