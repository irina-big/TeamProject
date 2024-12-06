package Tovstogan;

import allclasses.tovstogan.Student;
import allclasses.tovstogan.Tovstogan;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TovstoganTests {
    @Test
    public void testMethodOne() throws Exception {
        Tovstogan T = new Tovstogan();
        Assert.assertEquals("Hello", T.returnHello());
    }
    @Test
    public void testMethodTwo() throws Exception {
        int group = 123;
        Student S = new Student("Имя", "Фамилия", group);
        Assert.assertEquals(group, S.getGroup());
    }
}
