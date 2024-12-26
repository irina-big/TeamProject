package BuravlevTest;

import allclasses.buravlev.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BuravlevTest {
    @Test
    public void testGetInfo() throws Exception{
        Pet cat = new Pet("Крошик", 18 , "кот", 11 );

        Assert.assertEquals("Type: кот, Weight: 18 kg, Age: 11 years", cat.getInfo());
    }
    @Test
    public void testIsAdult() throws  Exception{
        Pet dog = new Pet("Барбос", 20, "собака", 8);
        boolean expected = true;
        Assert.assertEquals(expected, dog.isAdult());
    }
}
