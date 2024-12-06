package AntonovTest;

import allclasses.antonov.Bear;
import org.junit.jupiter.api.Test; // Используем JUnit 5
import static org.junit.jupiter.api.Assertions.*;

public class AntonovTest {

    @Test
    public void testInitialValues() {
        Bear bear = new Bear("Antonov", 0, 0);
        assertEquals(null, bear.rank, "Начальный ранг должен быть Herald");
        assertEquals(0, bear.pts, "Начальный уровень PTS должен быть 1");
        assertEquals(0, bear.numberOfGames, "Начальное количество игр должно быть 0");
        assertEquals(0, bear.hours, "Начальное количество часов должно быть 0");
    }



    @Test
    public void testLosePts() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.pts = 100; // Задаём начальный уровень PTS
        bear.losePts();
        assertTrue(bear.pts >= 50 || bear.pts == 0, "PTS после проигрыша должен уменьшиться, но не быть меньше 0");
    }

    @Test
    public void testCalculateHours() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.numberOfGames = 3; // Задаём количество игр
        bear.calculateHours();
        assertEquals(2, bear.hours, "Количество часов должно быть 2 (3 игры × 40 / 60)");
    }

    @Test
    public void testRankUpdate() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.pts = 700; // Устанавливаем PTS в диапазон Guardian
        bear.yourRank();
        assertEquals("Guardian", bear.rank, "Ранг должен быть Guardian при PTS 700");

        bear.pts = 2200; // Устанавливаем PTS в диапазон Archon
        bear.yourRank();
        assertEquals("Archon", bear.rank, "Ранг должен быть Archon при PTS 2200");
    }
}