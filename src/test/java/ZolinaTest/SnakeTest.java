package ZolinaTest;

import allclasses.zolina.Snake;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SnakeTest {

    @Test
    public void testSnakeDefaultKind() {
        Snake snake = new Snake();
        Assert.assertEquals("Удав", getFieldValue(snake, "kind"));
    }

    @Test
    public void testSnakeDefaultAge() {
        Snake snake = new Snake();
        Assert.assertEquals(2, getFieldValue(snake, "age"));
    }

    @Test
    public void testSnakeDefaultLength() {
        Snake snake = new Snake();
        Assert.assertEquals(60, getFieldValue(snake, "length"));
    }

    @Test
    public void testSnakeDefaultApple() {
        Snake snake = new Snake();
        Assert.assertEquals(1, getFieldValue(snake, "apple"));
    }

    @Test
    public void testSnakeParameterizedKind() {
        Snake snake = new Snake("Кобра", 5, 150, 3);
        Assert.assertEquals("Кобра", getFieldValue(snake, "kind"));
    }

    @Test
    public void testSnakeParameterizedAge() {
        Snake snake = new Snake("Кобра", 5, 150, 3);
        Assert.assertEquals(5, getFieldValue(snake, "age"));
    }

    @Test
    public void testSnakeParameterizedLength() {
        Snake snake = new Snake("Кобра", 5, 150, 3);
        Assert.assertEquals(150, getFieldValue(snake, "length"));
    }

    @Test
    public void testSnakeParameterizedApple() {
        Snake snake = new Snake("Кобра", 5, 150, 3);
        Assert.assertEquals(3, getFieldValue(snake, "apple"));
    }

    @Test
    public void testHissMethod() {
        Snake snake = new Snake("Кобра", 3, 100, 0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        snake.hiss();

        Assert.assertTrue(outContent.toString().trim().contains("Шшшш..."));
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