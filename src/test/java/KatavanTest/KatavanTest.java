package KatavanTest;

import org.junit.Test;
import allclasses.katavan.Katavan;

import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class KatavanTest {

    @Test
    @DisplayName("test")
    @Description("test")
    @TmsLink("Testcase-231")
    @Issue("BUG-34")
    public void testFactorialOfZero() {
        assertEquals(1, Katavan.factorial(0));
    }

    @Test
    @Step("1 step")
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