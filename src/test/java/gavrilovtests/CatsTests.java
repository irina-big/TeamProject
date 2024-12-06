package gavrilovtests;

import allclasses.gavrilov.Cats;
import org.junit.Assert;
import org.junit.Test;

public class CatsTests {
    @Test
    public void CheckTrueCatTest(){
        Cats cat = new Cats("Борис");
        Assert.assertEquals("Ваш кот есть в базе данных", cat.CheckCat());
    }

    @Test
    public void CheckFalseCatTest(){
        Cats cat = new Cats("Феликс");
        Assert.assertEquals("Вашего кота нет в базе данных", cat.CheckCat());
    }
}
