package petrovTests;

import allclasses.petrov.Programmer;
import org.junit.Assert;
import org.junit.Test;

public class petrovTest {

    @Test
    public void testInitialValues() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("написал 0 строк кода")); // Учитываем формат
        Assert.assertTrue(performance.contains("Уровень кофеина: 50")); // Начальный уровень кофеина
    }

    @Test
    public void testWriteCode() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.writeCode();
        String performance = programmer.getPerformance();
        Assert.assertFalse(performance.contains("строк кода: 0")); // Линии кода увеличиваются
        Assert.assertTrue(performance.contains("Уровень кофеина: 40") ||
                performance.contains("Уровень кофеина: 30")); // Кофеин уменьшается
    }

    @Test
    public void testDrinkCoffee() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.drinkCoffee();
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 70")); // Кофеин увеличился
    }

    @Test
    public void testDrinkCoffeeMaxLevel() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.drinkCoffee(); // Уровень кофеина: 70
        programmer.drinkCoffee(); // Уровень кофеина: 90
        programmer.drinkCoffee(); // Уровень кофеина: 100
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 100")); // Максимальный уровень
    }

    @Test
    public void testTakeBreak() {
        Programmer programmer = new Programmer("Alex Petrov", 27);
        programmer.takeBreak();
        String performance = programmer.getPerformance();
        Assert.assertTrue(performance.contains("Уровень кофеина: 80")); // Восстановленный кофеин
    }
}