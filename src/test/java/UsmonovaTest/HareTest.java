package UsmonovaTest;

import allclasses.Usmonova.Hare;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HareTest {

    @Test
    public void testGetBehavior() {
        Hare hare = new Hare();
        String expectedBehavior = "Заяцы обычно живут в норах и очень осторожны. Они быстро бегают и могут прыгать на большие расстояния.";
        assertEquals(expectedBehavior, hare.getBehavior());
    }

    @Test
    public void testSearchForFood_Day_WithPredators() {
        Hare hare = new Hare();
        String result = hare.searchForFood("День", true);
        assertEquals("Заяц прячется в норе, так как хищники близко.", result);
    }

    @Test
    public void testSearchForFood_Night() {
        Hare hare = new Hare();
        String result = hare.searchForFood("Ночь", false);
        assertEquals("Заяц выходит на поиск пищи, так как хищников нет.", result);
    }

    @Test
    public void testSearchForFood_OtherConditions() {
        Hare hare = new Hare();
        String result = hare.searchForFood("Утро", false);
        assertTrue(result.contains("Заяц нашёл"));
    }

    @Test
    public void testGetFood() throws Exception {
        Hare hare = new Hare();
        List<String> expectedFood = List.of("Трава", "Листья", "Корнеплоды");
        assertEquals(expectedFood, hare.getFood("Заяц"));
    }
}
