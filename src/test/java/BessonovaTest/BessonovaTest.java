package BessonovaTest;

import allclasses.Bessonova.Stone;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class  BessonovaTest {

    @Test
    public void testDefaultColor() {
        Stone stone = new Stone();
        Assert.assertEquals("Серый", getFieldValue(stone, "color"));
    }

    @Test
    public void testDefaultMood() {
        Stone stone = new Stone();
        Assert.assertEquals("Нейтральное", getFieldValue(stone, "mood"));
    }

    @Test
    public void testDefaultRoughnessLevel() {
        Stone stone = new Stone();
        Assert.assertEquals(50, getFieldValue(stone, "roughnessLevel"));
    }

    @Test
    public void testDefaultSpikiness() {
        Stone stone = new Stone();
        Assert.assertFalse((boolean) getFieldValue(stone, "spikiness"));
    }

    @Test
    public void testDefaultHabitat() {
        Stone stone = new Stone();
        Assert.assertEquals("Горы", getFieldValue(stone, "habitat"));
    }

    @Test
    public void testParameterizedColor() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        Assert.assertEquals("Красный", getFieldValue(stone, "color"));
    }

    @Test
    public void testParameterizedMood() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        Assert.assertEquals("Веселое", getFieldValue(stone, "mood"));
    }

    @Test
    public void testParameterizedRoughnessLevel() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        Assert.assertEquals(30, getFieldValue(stone, "roughnessLevel"));
    }

    @Test
    public void testParameterizedSpikiness() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        Assert.assertTrue((boolean) getFieldValue(stone, "spikiness"));
    }

    @Test
    public void testParameterizedHabitat() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        Assert.assertEquals("Пустыня", getFieldValue(stone, "habitat"));
    }

    @Test
    public void testSoak() {
        Stone stone = new Stone("Красный", "Веселое", 20, true, "Пустыня");
        stone.soak();
        Assert.assertEquals(10, getFieldValue(stone, "roughnessLevel"));
    }

    @Test
    public void testSoakToSmooth() {
        Stone stone = new Stone("Красный", "Веселое", 5, true, "Пустыня");
        stone.soak();
        Assert.assertEquals(0, getFieldValue(stone, "roughnessLevel"));
    }

    @Test
    public void testPrintCharacteristics() {
        Stone stone = new Stone("Красный", "Веселое", 30, true, "Пустыня");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        stone.printCharacteristics();

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("Цвет: Красный"));
        Assert.assertTrue(output.contains("Настроение: Веселое"));
        Assert.assertTrue(output.contains("Уровень шершавости: 30"));
        Assert.assertTrue(output.contains("Колючесть: Да"));
        Assert.assertTrue(output.contains("Среда обитания: Пустыня"));
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
