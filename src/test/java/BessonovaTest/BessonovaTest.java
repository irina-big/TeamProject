package BessonovaTest;

import allclasses.Bessonova.Stone;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import io.qameta.allure.Issue;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BessonovaTest {

    @Test
    @DisplayName("Изменение цвета камня")
    @Description("Задаём камню дефолт-серый цвет")
    @TmsLink("TMS-001")
    @Issue("BUG-1234")
    public void testDefaultColor() {
        Stone stone = createDefaultStone();
        verifyColor(stone, "Серый");
    }

    @Test
    @DisplayName("Изменение настроения камня")
    @Description("Задаём камню дефолт настроение")
    @TmsLink("TMS-002")
    @Issue("BUG-1235")
    public void testDefaultMood() {
        Stone stone = createDefaultStone();
        verifyMood(stone, "Нейтральное");
    }

    @Test
    @DisplayName("Изменение шершавости камня")
    @Description("Задаём камню дефолт шершавость")
    @TmsLink("TMS-003")
    @Issue("BUG-1236")
    public void testDefaultRoughnessLevel() {
        Stone stone = createDefaultStone();
        verifyRoughnessLevel(stone, 50);
    }

    @Test
    @DisplayName("Изменение колючести камня")
    @Description("Задаём камню колючесть")
    @TmsLink("TMS-004")
    @Issue("BUG-1237")
    public void testDefaultSpikiness() {
        Stone stone = createDefaultStone();
        verifySpikiness(stone, false);
    }

    @Test
    @DisplayName("Изменение среды обитания камня")
    @Description("Задаём камню среду обитания 'Горы'")
    @TmsLink("TMS-005")
    @Issue("BUG-1238")
    public void testDefaultHabitat() {
        Stone stone = createDefaultStone();
        verifyHabitat(stone, "Горы");
    }

    @Step("Создаем дефолтный камень")
    private Stone createDefaultStone() {
        return new Stone();
    }

    @Step("Проверяем цвет: {expectedColor}")
    private void verifyColor(Stone stone, String expectedColor) {
        Assert.assertEquals(expectedColor, getFieldValue(stone, "color"));
    }

    @Step("Проверяем настроение: {expectedMood}")
    private void verifyMood(Stone stone, String expectedMood) {
        Assert.assertEquals(expectedMood, getFieldValue(stone, "mood"));
    }

    @Step("Проверяем уровень шершавости: {expectedLevel}")
    private void verifyRoughnessLevel(Stone stone, int expectedLevel) {
        Assert.assertEquals(expectedLevel, getFieldValue(stone, "roughnessLevel"));
    }

    @Step("Проверяем колючесть: {expectedSpikiness}")
    private void verifySpikiness(Stone stone, boolean expectedSpikiness) {
        Assert.assertEquals(expectedSpikiness, getFieldValue(stone, "spikiness"));
    }

    @Step("Проверяем среду обитания: {expectedHabitat}")
    private void verifyHabitat(Stone stone, String expectedHabitat) {
        Assert.assertEquals(expectedHabitat, getFieldValue(stone, "habitat"));
    }

    @Test
    @DisplayName("Проверяем Пустынный камень на цвет")
    @Description("Изменяем Пустынному камню цвет")
    @TmsLink("TMS-006")
    @Issue("BUG-1239")
    public void testParameterizedColor() {
        Stone stone = createParameterizedStone("Красный", "Веселое", 30, true, "Пустыня");
        verifyColor(stone, "Красный");
    }

    @Step("Создаем параметризованный камень с цветом {color}, настроением {mood}, шершавостью {roughnessLevel}, колючестью {spikiness}, средой обитания {habitat}")
    private Stone createParameterizedStone(String color, String mood, int roughnessLevel, boolean spikiness, String habitat) {
        return new Stone(color, mood, roughnessLevel, spikiness, habitat);
    }

    @Step("Получаем значение поля {fieldName}")
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
