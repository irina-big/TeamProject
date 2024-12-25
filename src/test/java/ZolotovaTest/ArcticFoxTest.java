package ZolotovaTest;

import allclasses.zolotova.ArcticFox;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import io.qameta.allure.junit4.DisplayName; // импорт DisplayName mvn dependency:tree
import io.qameta.allure.Description; // импорт Description
import io.qameta.allure.Step; // импорт Step
import io.qameta.allure.TmsLink; // импорт для TmsLink
import io.qameta.allure.Issue;   // импорт для Issue

public class ArcticFoxTest {

    @Test
    @DisplayName("Имя по умолчанию должно быть 'Безымянный писец'")
    @Description("Тест проверяет, что имя полярной лисы по умолчанию установлено как 'Безымянный писец'")
    @TmsLink("TMS-001")
    @Issue("ISSUE-101")
    public void testDefaultName() {
        ArcticFox fox = createDefaultArcticFoxWithStep();
        verifyFieldValueWithStep(fox, "name", "Безымянный писец");
    }

    @Test
    @DisplayName("Имя должно быть корректно задано через конструктор")
    @Description("Тест проверяет, что имя полярной лисы корректно задаётся через параметризированный конструктор")
    @TmsLink("TMS-002")
    @Issue("ISSUE-102")
    public void testParameterizedName() {
        ArcticFox fox = createCustomArcticFox("Полярник", 5, 6.2, 50);
        verifyFieldValueWithStep(fox, "name", "Полярник");
    }

    @Test
    @DisplayName("Имя должно быть пустой строкой, если передано пустое значение")
    @Description("Тест проверяет, что имя полярной лисы корректно обрабатывается как пустая строка, если передано пустое значение")
    @TmsLink("TMS-003")
    @Issue("ISSUE-103")
    public void testEmptyName() {
        ArcticFox fox = createCustomArcticFox("", 5, 6.2, 50);
        verifyFieldValueWithStep(fox, "name", "");
    }

    @Test
    @DisplayName("Имя должно быть null-safe")
    @Description("Тест проверяет, что имя полярной лисы безопасно обрабатывает null значение")
    @TmsLink("TMS-004")
    @Issue("ISSUE-104")
    public void testNullName() {
        ArcticFox fox = createCustomArcticFox(null, 5, 6.2, 50);
        verifyFieldValueWithStep(fox, "name", null);
    }

    @Test
    @DisplayName("Возраст по умолчанию должен быть 3")
    @Description("Тест проверяет, что возраст полярной лисы по умолчанию установлен как 3 года")
    @TmsLink("TMS-005")
    @Issue("ISSUE-105")
    public void testDefaultAge() {
        ArcticFox fox = createDefaultArcticFox();
        verifyFieldValue(fox, "age", 3);
    }

    @Test
    @DisplayName("Вес по умолчанию должен быть 4.5")
    @Description("Тест проверяет, что вес полярной лисы по умолчанию установлен как 4.5 кг")
    @TmsLink("TMS-006")
    @Issue("ISSUE-106")
    public void testDefaultWeight() {
        ArcticFox fox = createDefaultArcticFox();
        verifyFieldValue(fox, "weight", 4.5, 0.01);
    }

    @Test
    @DisplayName("Количество следов на снегу по умолчанию должно быть 0")
    @Description("Тест проверяет, что количество оставленных следов на снегу по умолчанию равно 0")
    @TmsLink("TMS-007")
    @Issue("ISSUE-107")
    public void testDefaultSnowTracksLeft() {
        ArcticFox fox = createDefaultArcticFox();
        verifyFieldValue(fox, "snowTracksLeft", 0);
    }

    @Test
    @DisplayName("Параметризированный конструктор должен корректно задавать возраст")
    @Description("Тест проверяет, что параметризированный конструктор корректно задаёт возраст полярной лисы")
    @TmsLink("TMS-008")
    @Issue("ISSUE-108")
    public void testParameterizedAge() {
        ArcticFox fox = createCustomArcticFox("Полярник", 5, 6.2, 50);
        verifyFieldValue(fox, "age", 5);
    }

    @Test
    @DisplayName("Параметризированный конструктор должен корректно задавать вес")
    @Description("Тест проверяет, что параметризированный конструктор корректно задаёт вес полярной лисы")
    @TmsLink("TMS-009")
    @Issue("ISSUE-109")
    public void testParameterizedWeight() {
        ArcticFox fox = createCustomArcticFox("Полярник", 5, 6.2, 50);
        verifyFieldValue(fox, "weight", 6.2, 0.01);
    }

    @Test
    @DisplayName("Параметризированный конструктор должен корректно задавать количество следов на снегу")
    @Description("Тест проверяет, что параметризированный конструктор корректно задаёт количество следов на снегу")
    @TmsLink("TMS-010")
    @Issue("ISSUE-110")
    public void testParameterizedSnowTracksLeft() {
        ArcticFox fox = createCustomArcticFox("Полярник", 5, 6.2, 50);
        verifyFieldValue(fox, "snowTracksLeft", 50);
    }

    @Test
    @DisplayName("Метод leaveTracks должен выводить корректное сообщение")
    @Description("Тест проверяет, что метод leaveTracks выводит сообщение с количеством оставленных следов")
    @TmsLink("TMS-011")
    @Issue("ISSUE-111")
    public void testLeaveTracks() {
        ArcticFox fox = createDefaultArcticFox();
        verifyLeaveTracksOutput(fox);
    }

    @Test
    @DisplayName("Метод printCharacteristics должен выводить все характеристики")
    @Description("Тест проверяет, что метод printCharacteristics выводит корректные характеристики полярной лисы")
    @TmsLink("TMS-012")
    @Issue("ISSUE-112")
    public void testPrintCharacteristics() {
        ArcticFox fox = createCustomArcticFox("Полярник", 5, 6.2, 50);
        verifyPrintCharacteristicsOutput(fox);
    }

    @Step("Создание экземпляра ArcticFox со значениями по умолчанию")
    private ArcticFox createDefaultArcticFox() {
        return new ArcticFox();
    }

    @Step("Создание экземпляра ArcticFox со значениями по умолчанию для теста testDefaultName")
    private ArcticFox createDefaultArcticFoxWithStep() {
        return new ArcticFox();
    }

    @Step("Создание экземпляра ArcticFox с параметрами: имя={0}, возраст={1}, вес={2}, следы={3}")
    private ArcticFox createCustomArcticFox(String name, int age, double weight, int snowTracksLeft) {
        return new ArcticFox(name, age, weight, snowTracksLeft);
    }

    @Step("Проверка значения поля {1} на равенство {2}")
    private void verifyFieldValueWithStep(Object obj, String fieldName, Object expectedValue) {
        Assert.assertEquals(expectedValue, getFieldValue(obj, fieldName));
    }

    @Step("Проверка значения поля {1} на равенство {2}")
    private void verifyFieldValue(Object obj, String fieldName, Object expectedValue) {
        Assert.assertEquals(expectedValue, getFieldValue(obj, fieldName));
    }

    @Step("Проверка значения поля {1} на равенство {2} с погрешностью {3}")
    private void verifyFieldValue(Object obj, String fieldName, double expectedValue, double delta) {
        Assert.assertEquals(expectedValue, (Double) getFieldValue(obj, fieldName), delta);
    }

    @Step("Проверка вывода метода leaveTracks")
    private void verifyLeaveTracksOutput(ArcticFox fox) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        fox.leaveTracks();

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("оставил"));
        Assert.assertTrue(output.matches(".*\\d+ следов на снегу\\."));
    }

    @Step("Проверка вывода метода printCharacteristics")
    private void verifyPrintCharacteristicsOutput(ArcticFox fox) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        fox.printCharacteristics();

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("Имя: Полярник"));
        Assert.assertTrue(output.contains("Возраст: 5 лет"));
        Assert.assertTrue(output.contains("Вес: 6.2 кг"));
        Assert.assertTrue(output.contains("Следы на снегу: 50"));
    }

    // Вспомогательный метод для доступа к приватным полям через reflection
    private Object getFieldValue(Object obj, String fieldName) {
        try {
            java.lang.reflect.Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
