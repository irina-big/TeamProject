package HrustaliovaTests;

import allclasses.hrustaliova.Rat;
import org.junit.Test;

import static org.junit.Assert.*;

public class RatsTests {

    @Test
    public void testRatConstructor() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("TestRat", rat.getName());
        assertEquals(100, rat.getWeight());
        assertTrue(rat.isHungry()); // Крыса должна быть голодной после создания
    }

    @Test
    public void testRatFeed() {
        Rat rat = new Rat("TestRat", 100);
        rat.feed(50);
        assertEquals(150, rat.getWeight());
        assertFalse(rat.isHungry()); // Крыса не должна быть голодной после кормления
    }

    @Test
    public void testRatFeedNegativeAmount() {
        Rat rat = new Rat("TestRat", 100);
        rat.feed(-50); //Попытка накормить отрицательным количеством
        assertEquals(100, rat.getWeight()); //Вес не должен измениться
        assertTrue(rat.isHungry()); // Крыса остается голодной
    }


    @Test
    public void testRatSetWeightPositive() {
        Rat rat = new Rat("TestRat", 100);
        rat.setWeight(150);
        assertEquals(150, rat.getWeight());
    }

    @Test
    public  void testRatSetWeightNegative() {
        Rat rat = new Rat("TestRat", 100);
        rat.setWeight(-50); //Попытка установить отрицательный вес
        assertEquals(100, rat.getWeight()); //Вес не должен измениться
    }

    @Test
    public void testRatDescribe() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("Имя: TestRat, Вес: 100, Голодная: true", rat.describe());
        rat.feed(50);
        assertEquals("Имя: TestRat, Вес: 150, Голодная: false", rat.describe());
    }

    @Test
    public void testRatGetName() {
        Rat rat = new Rat("TestRat", 100);
        assertEquals("TestRat", rat.getName());
    }

    @Test
    public void testRatSetName(){
        Rat rat = new Rat("TestRat", 100);
        rat.setName("NewName");
        assertEquals("NewName", rat.getName());
    }
}