package UrzhumovaTests;

import allclasses.urzhumova.Whale;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WhaleTest {
    @Test
    public void testMethodFood() throws Exception {
        Whale whale = new Whale();
        Assert.assertEquals(whale.eatMeat(), List.of("Планктон","Креветки"));
    }
    @Test
    public void testMethodCompareEqual() throws Exception {
        Whale whale1 = new Whale(140);
        Whale whale2 = new Whale(140);
        Assert.assertEquals(Whale.compare(whale1,whale2), "Киты равны");
    }
    @Test
    public void testMethodCompareFirstBigger() throws Exception {
        Whale whale1 = new Whale(160);
        Whale whale2 = new Whale(140);
        Assert.assertEquals(Whale.compare(whale1,whale2), "Первый кит больше второго");
    }
    @Test
    public void testMethodCompareSecondBigger() throws Exception {
        Whale whale1 = new Whale(160);
        Whale whale2 = new Whale(170);
        Assert.assertEquals(Whale.compare(whale1,whale2), "Второй кит больше первого");
    }
}
