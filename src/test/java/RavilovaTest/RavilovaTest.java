package RavilovaTest;

import allclasses.ravilova.RavilovaClass;
import org.junit.Assert;
import org.junit.Test;

public class RavilovaTest {
    @Test
    public void testFindMax() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        int[] numbers = {1, 5, 3, 9, 2};
        Assert.assertEquals(9, ravilovaClass.findMax(numbers));
    }

    @Test
    public void testFindMaxWithSingleElement() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        int[] singleElement = {42};
        Assert.assertEquals(42, ravilovaClass.findMax(singleElement));
    }

    @Test
    public void testAddNumbers() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        Assert.assertEquals(5, ravilovaClass.addNumbers(2, 3));
    }

    @Test
    public void testCountWords() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        String sentence = "Hello world";
        Assert.assertEquals(2, ravilovaClass.countWords(sentence));
    }

    @Test
    public void testCountWordsWithEmptyString() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        String sentence = "";
        Assert.assertEquals(0, ravilovaClass.countWords(sentence));
    }

    @Test
    public void testCountWordsWithNull() throws Exception {
        RavilovaClass ravilovaClass = new RavilovaClass();
        String sentence = null;
        Assert.assertEquals(0, ravilovaClass.countWords(sentence));
    }
}
