package PortovTest;

import allclasses.Portov.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortovTests
{
    @Test
    //@DisplayName("Проверка, что у нас правильный вывод приветствия")
    public void testIntroduce() {
        // Создаём объект Person
        Person person = new Person("Алексей", 25);

        // Проверяем, что introduce возвращает правильную строку
        String expected = "Привет, меня зовут Алексей, мне 25 лет.";
        assertEquals(expected, person.introduce());
    }

    @Test
    //@DisplayName("Проверка, что у нас корректно изменился возраст")
    public void testHaveBirthday() {
        Person person = new Person("Алексей", 25);

        person.haveBirthday();

        // Проверяем, что возраст увеличился на 1
        assertEquals(26, person.getAge());
    }

    @Test
    //@DisplayName("Проверка, что у нас правильный вывод приветствия")
    public void testMultipleBirthdays() {
        Person person = new Person("Алексей", 25);

        // Увеличиваем возраст несколько раз
        person.haveBirthday();
        person.haveBirthday();
        person.haveBirthday();

        // Проверяем, что возраст увеличился на 3
        assertEquals(28, person.getAge());
    }
}
