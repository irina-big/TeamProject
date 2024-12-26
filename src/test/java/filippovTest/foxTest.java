package filippovTest;

import allclasses.filippov.Fox;
import org.junit.Assert;
import org.junit.Test;

public class foxTest {
    @Test
    public void getHuntingRangReturnF() throws Exception{
        Fox foxy = new Fox();
        var lowRank = "F";
        Assert.assertEquals(lowRank, foxy.getHuntingRang());
    }
    @Test
    public void upHuntingRangToMaxReturnP() throws Exception{
        Fox foxy = new Fox();
        var maxRank = "P";
        while(foxy.getHuntingRang() != foxy.upHuntingRang()){}
        Assert.assertEquals(maxRank, foxy.getHuntingRang());
    }
    @Test
    public void setHeightNormalHeightEqualsGetHeight() throws Exception{
        Fox foxy = new Fox();
        var testHeight = 40;
        foxy.setHeight(testHeight);
        Assert.assertEquals(testHeight, foxy.getHeight());
    }
}
