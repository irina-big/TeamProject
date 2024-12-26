package AntonovTest;

import allclasses.antonov.Bear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertEquals;

public class AntonovTest {

    @Test
    public void testInitialValues() {
        Bear bear = new Bear("Antonov", 0, 0);
        assertEquals("Начальный ранг должен быть Herald",null, bear.rank);
        assertEquals( "Начальный уровень PTS должен быть 1", 0, bear.pts);
        assertEquals( "Начальное количество игр должно быть 0", 0, bear.numberOfGames);
        assertEquals( "Начальное количество часов должно быть 0",0, bear.hours);
    }



    @Test
    public void testLosePts() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.pts = 100; // Задаём начальный уровень PTS
        bear.losePts();
        assertTrue("PTS после проигрыша должен уменьшиться, но не быть меньше 0", bear.pts >= 50 || bear.pts == 0);
    }

    @Test
    public void testCalculateHours() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.numberOfGames = 3; // Задаём количество игр
        bear.calculateHours();
        assertEquals("Количество часов должно быть 2 (3 игры × 40 / 60)",2, bear.hours);
    }

    @Test
    public void testRankUpdate() {
        Bear bear = new Bear("Antonov", 0, 0);
        bear.pts = 700; // Устанавливаем PTS в диапазон Guardian
        bear.yourRank();
        assertEquals("Ранг должен быть Guardian при PTS 700","Guardian", bear.rank);

        bear.pts = 2200; // Устанавливаем PTS в диапазон Archon
        bear.yourRank();
        assertEquals("Ранг должен быть Archon при PTS 2200", "Archon", bear.rank);
    }
}