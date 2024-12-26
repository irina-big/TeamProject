package smirnovaTest;

import allclasses.smirnova.Seal;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SealTest {

    @Test
    public void testSealDefaultConstructor() {
        Seal seal = new Seal();
        Assert.assertEquals("Крошик", getFieldValue(seal, "name"));
        Assert.assertEquals(0, getFieldValue(seal, "age"));
        Assert.assertEquals(1, getFieldValue(seal, "daily_naps"));
        Assert.assertEquals(0.0, (double) getFieldValue(seal, "weight"), 0.01);
    }

    @Test
    public void testSealParameterizedConstructor() {
        Seal seal = new Seal("Ластик", 5, 2, 20.0);
        Assert.assertEquals("Ластик", getFieldValue(seal, "name"));
        Assert.assertEquals(5, getFieldValue(seal, "age"));
        Assert.assertEquals(1, getFieldValue(seal, "daily_naps")); // Default value for daily_naps
        Assert.assertEquals(20.0, (double) getFieldValue(seal, "weight"), 0.01);
    }
    @Test
    public void testTriksWithAgeZero() {
        Seal seal = new Seal("Крошик", 0, 1, 10.0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        seal.triks();

        String expectedOutput = "Крошик слишком маленький, чтобы делать трюки.";
        Assert.assertTrue(outContent.toString().trim().contains(expectedOutput));
    }

    @Test
    public void testTriksWithPositiveAge() {
        Seal seal = new Seal("Крошик", 3, 1, 15.0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        seal.triks();

        String output = outContent.toString().trim();
        Assert.assertTrue(output.contains("Крошик сегодня празднует день рождения!"));
        Assert.assertTrue(output.contains("Трюк 1"));
        Assert.assertTrue(output.contains("Трюк 2"));
        Assert.assertTrue(output.contains("Трюк 3"));
    }

    private Object getFieldValue(Object obj, String fieldName) {
        try {
            var field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
