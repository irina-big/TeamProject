package PokrovskayaTest;

import allclasses.Pokrovskaya.PokrovClass;
//import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PokrovskayaTest {

    // Тест для метода start()
    @Test
    @DisplayName("Проверка метода start")
    //@Description("Транспорт типа Автомобиль запускается.")
    public void getStart() {
        // Создаем объект транспорта
        PokrovClass pokrovClass = new PokrovClass("Автомобиль", 4);

        Assert.assertEquals("Транспорт типа Автомобиль запускается.", pokrovClass.start());
    }

    // Тест для метода stop()
    @Test
    @DisplayName("Проверка метода stop")
    //@Description("Транспорт типа Велосипед остановлен.")
    public void testStop() {
        // Создаем объект транспорта
        PokrovClass pokrovClass = new PokrovClass("Велосипед", 1);

        Assert.assertEquals("Транспорт типа Велосипед остановлен.", pokrovClass.stop());
    }

    // Тест для проверки значений полей type и capacity
    @Test
    //@DisplayName("Проверка значений полей type и capacity")
    public void testTransportFields() {
        // Создаем объект транспорта
        PokrovClass pokrovClass = new PokrovClass("Автомобиль", 5);

        // Проверяем корректность значений
        Assert.assertEquals("Автомобиль", pokrovClass.getType());
        Assert.assertEquals(5, pokrovClass.getCapacity());
    }
}
