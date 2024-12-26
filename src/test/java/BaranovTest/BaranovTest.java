package BaranovTest;

import allclasses.Baranov.Baranov;
import io.qameta.allure.Step;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import static org.junit.Assert.*;

public class BaranovTest {

    // Тесты для сложения
    @Test
    public void testAddPositiveNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(8, baranov.add(5, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(-8, baranov.add(-5, -3));
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(2, baranov.add(5, -3));
    }

    // Тесты для умножения
    @Test
    public void testMultiplyPositiveNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(15, baranov.multiply(5, 3));
    }

    @Test
    @DisplayName("Тестирование на отрицательные числа")
    @Description("Тест прошёл успешно")
    public void testMultiplyNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(15, baranov.multiply(-5, -3));
    }

    @Test
    public void testMultiplyPositiveAndNegativeNumbers() {
        Baranov baranov = new Baranov();
        assertEquals(-15, baranov.multiply(5, -3));
    }
    @Step("Шаг первый")
    public void methodForStep0ne()
    {
        System.out.println("Вызов метода шага 1");
    }
    @Step("Шаг второй")
    public void methodForStepTwo()
    {
        System.out.println("Вызов метода шага 2");
    }

}
