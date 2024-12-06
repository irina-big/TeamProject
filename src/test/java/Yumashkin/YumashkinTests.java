package Yumashkin;

import allclasses.yumashkin.Sport;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class YumashkinTests {
    @Test
    public void testGetSportReturnItems1() throws Exception {
        Sport sport = new Sport();
        Assert.assertEquals(sport.getSport("Хоккей"), List.of("Шайба", "Клюшка"));
    }
    @Test
    public void testGetSportReturnItems2() throws Exception {
        Sport sport = new Sport();
        Assert.assertEquals(sport.getSport("Футбол"), List.of("Футбольный мяч", "Бутсы"));
    }
    @Test
    public void testGetAnyPos() throws Exception {
        Sport sport = new Sport();
        Assert.assertEquals(sport.getPos(),("Есть такие виды позиций в спорте как: нападающий, защитник, вратарь"));
    }
}