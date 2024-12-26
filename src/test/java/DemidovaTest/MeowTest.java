package DemidovaTest;

import allclasses.demidova.Meow;
import org.junit.Assert;
import org.junit.Test;

public class MeowTest {
    @Test
    public void testDefaultMeow() {
        Meow defaultMeow = new Meow();
        Assert.assertEquals("рысь", defaultMeow.getFelineType());
        Assert.assertEquals("Ирис", defaultMeow.getName());
    }

    @Test
    public void testConstructedMeow() {
        Meow constructedMeow = new Meow("пантера", "Барти");
        Assert.assertEquals("пантера", constructedMeow.getFelineType());
        Assert.assertEquals("Барти", constructedMeow.getName());
    }
}
