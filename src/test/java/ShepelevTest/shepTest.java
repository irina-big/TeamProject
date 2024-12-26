package ShepelevTest;

import allclasses.shepelev.shep;
import org.junit.Assert;
import org.junit.Test;

public class shepTest {
    @Test
    public void CheckTrueDogTest(){
        shep dog= new shep("Бобик");
        Assert.assertEquals("Ваша собака есть в базе данных", dog.CheckDog());
    }

    @Test
    public void CheckFalseDogTest(){
        shep dog = new shep("Феликс");
        Assert.assertEquals("Вашей собаки нет в базе данных", dog.CheckDog());
    }
}
