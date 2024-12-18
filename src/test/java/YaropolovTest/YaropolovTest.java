package YaropolovTest;

import allclasses.yaropolov.Bebra;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;


import static org.junit.Assert.*;

public class YaropolovTest {

    @Test
    @DisplayName("Тест начальных значений")
    @Description("Проверяет, что при создании игрока начальное количество трофеев, сыгранных боев и выигранных боев устанавливаются правильно.")
    public void testInitialValues() {
        Bebra player = new Bebra("Player1", 1000);
        assertEquals("Начальное количество трофеев должно быть 1000", 1000, player.trophies);
        assertEquals("Начальное количество сыгранных боев должно быть 0", 0, player.battlesPlayed);
        assertEquals("Начальное количество выигранных боев должно быть 0", 0, player.battlesWon);
    }

    @Test
    @DisplayName("Тест выигрыша боя")
    @Description("Проверяет, что при выигрыше боя количество сыгранных боев и выигранных боев увеличивается, а количество трофеев увеличивается.")
    @TmsLink("TC-001")
    @Step("Выполняем тест выигрыша боя")
    public void testWinBattle() {
        Bebra player = new Bebra("Player1", 1000);
        int initialTrophies = player.trophies;
        player.playBattle(true);
        assertEquals("Количество сыгранных боев должно быть 1", 1, player.battlesPlayed);
        assertEquals("Количество выигранных боев должно быть 1", 1, player.battlesWon);
        assertTrue("Количество трофеев должно увеличиться. Было:" + initialTrophies + " Стало: " + player.trophies, player.trophies > initialTrophies);

    }

    @Test
    @DisplayName("Тест проигрыша боя")
    @Description("Проверяет, что при проигрыше боя количество сыгранных боев увеличивается, количество выигранных боев не меняется, а количество трофеев уменьшается, но не меньше 0.")
    @Issue("BUG-001")
    @Step("Выполняем тест проигрыша боя")
    public void testLostBattle() {
        Bebra player = new Bebra("Player1", 1000);
        int initialTrophies = player.trophies;
        player.playBattle(false);
        assertEquals("Количество сыгранных боев должно быть 1", 1, player.battlesPlayed);
        assertEquals("Количество выигранных боев должно быть 0", 0, player.battlesWon);
        assertTrue("Количество трофеев должно уменьшиться, но не меньше 0. Было:" + initialTrophies + " Стало: " + player.trophies, player.trophies <= initialTrophies && player.trophies >= 0);
    }


    @Test
    @DisplayName("Тест нескольких боев")
    @Description("Проверяет, что при нескольких боях счетчик боев и побед считается правильно")
    public void testMultipleBattles() {
        Bebra player = new Bebra("Player1", 1000);
        player.playBattle(true);
        player.playBattle(false);
        player.playBattle(true);
        assertEquals("Количество сыгранных боев должно быть 3", 3, player.battlesPlayed);
        assertEquals("Количество выигранных боев должно быть 2", 2, player.battlesWon);
    }

    @Test
    @DisplayName("Тест сброса трофеев")
    @Description("Проверяет, что при сбросе трофеев количество трофеев становится равным 0")
    public void testResetTrophies(){
        Bebra player = new Bebra("Player1", 1000);
        player.resetTrophies();
        assertEquals("Количество трофеев должно быть 0", 0, player.trophies);
    }
}