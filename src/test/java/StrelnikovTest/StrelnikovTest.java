package StrelnikovTest;

import allclasses.strelnikov.Capybara;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrelnikovTest {

    @Test
    public void testConstructorInitializesFields() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        assertEquals("Каппи", capy.getName()); // Используем геттер
    }

    @Test
    public void testEatIncreasesWeight() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        capy.eat(2.0);
        assertEquals(37.5, capy.getWeight(), 0.01); // Проверяем вес через геттер
    }

    @Test
    public void testPlayDecreasesWeight() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        capy.play(1.5);
        assertEquals(34.0, capy.getWeight(), 0.01); // Проверяем вес через геттер
    }

    @Test
    public void testGrowOlderIncreasesAge() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        capy.growOlder();
        assertEquals(4, capy.getAge()); // Проверяем возраст через геттер
    }

    @Test
    public void testSpeakOutput() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        String expectedMessage = "Каппи говорит: Хрю-хрю!";

        // Перехватываем вывод в консоль
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        capy.speak();

        assertEquals(expectedMessage, outContent.toString().trim()); // Проверяем сообщение
    }

    @Test
    public void testSwimOutput() {
        Capybara capy = new Capybara("Каппи", 3, 35.5);
        String expectedMessage = "Каппи плавает в озере. Это ее любимое занятие!";

        // Перехватываем вывод в консоль
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        capy.swim();

        assertEquals(expectedMessage, outContent.toString().trim()); // Проверяем сообщение
    }
}
