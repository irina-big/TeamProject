package UrzhumovaTests;

import allclasses.urzhumova.Whale;
import io.qameta.allure.Step;
import org.junit.Test;
import io.qameta.allure.Description;
//import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;


import java.util.List;

public class WhaleTest {
    @Test
    //@DisplayName("Проверка чем питаются киты")
    @Description("Киты питаются планктоном и креветками")
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
        Whale whale1 = CreateWhale1();
        Whale whale2 = CreateWhale2();
        Assert.assertEquals(Whale.compare(whale1,whale2), "Первый кит больше второго");
    }

    @Step("Шаг первый: создание первого кита")
    public Whale CreateWhale1(){
        return new Whale(160);
    }

    @Step("Шаг второй: создание второго кита")
    public Whale CreateWhale2(){
        return new Whale(140);
    }

    @Test
    public void testMethodCompareSecondBigger() throws Exception {
        Whale whale1 = new Whale(160);
        Whale whale2 = new Whale(170);
        Assert.assertEquals(Whale.compare(whale1,whale2), "Второй кит больше первого");
    }
}
