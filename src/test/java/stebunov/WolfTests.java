package stebunov;

import allclasses.stebunov.Wolf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WolfTests {

    // Тест конструктора по умолчанию
    @Test
    public void testDefaultConstructor() {
        Wolf wolf = new Wolf();
        assertEquals("Безымянный", wolf.getName());
        assertEquals(0, wolf.getAge());
        assertEquals(0.0, wolf.getWeight(), 0.01);
    }

    // Тест конструктора с параметрами
    @Test
    public void testParameterizedConstructor() {
        Wolf wolf = new Wolf("Серый", 5, 40.5);
        assertEquals("Серый", wolf.getName());
        assertEquals(5, wolf.getAge());
        assertEquals(40.5, wolf.getWeight(), 0.01);
    }

    // Тест метода setName
    @Test
    public void testSetName() {
        Wolf wolf = new Wolf();
        wolf.setName("Белый");
        assertEquals("Белый", wolf.getName());
    }

    // Тест метода setAge с корректным значением
    @Test
    public void testSetAgeCorrect() {
        Wolf wolf = new Wolf();
        wolf.setAge(3);
        assertEquals(3, wolf.getAge());
    }

    // Тест метода setAge с некорректным значением (отрицательный возраст)
    @Test
    public void testSetAgeIncorrect() {
        Wolf wolf = new Wolf();
        wolf.setAge(-5); // Должно вывести сообщение об ошибке, но не изменить значение
        assertEquals(0, wolf.getAge());
    }

    // Тест метода setWeight с корректным значением
    @Test
    public void testSetWeightCorrect() {
        Wolf wolf = new Wolf();
        wolf.setWeight(30.5);
        assertEquals(30.5, wolf.getWeight(), 0.01);
    }

    // Тест метода setWeight с некорректным значением (отрицательный вес)
    @Test
    public void testSetWeightIncorrect() {
        Wolf wolf = new Wolf();
        wolf.setWeight(-10); // Должно вывести сообщение об ошибке, но не изменить значение
        assertEquals(0.0, wolf.getWeight(), 0.01);
    }

    // Тест метода howl
    @Test
    public void testHowl() {
        Wolf wolf = new Wolf("Серый", 5, 25.5);
        assertEquals("Волк Серый воет: Аууууу!", wolf.howl());
    }
}