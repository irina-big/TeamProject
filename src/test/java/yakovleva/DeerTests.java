package yakovleva;

import allclasses.yakovleva.Deer;
import allclasses.yakovleva.Type;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Assert;
import org.junit.Test;

public class DeerTests 
{
    @Test
    public void AgeDayBeforeToday3() 
    {
        Deer deer = new Deer("Ми", LocalDate.of(2020, 10, 12), Type.лань);
       
        int actual = deer.Age();

        Period period = Period.between(deer.getBirthday(), LocalDate.now());
        int expected = period.getYears();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AgeDayAfterToday2() 
    {
        Deer deer = new Deer("Ми", LocalDate.of(2020, 12, 28), Type.лань);
       
        int actual = deer.Age();
        
        Period period = Period.between(deer.getBirthday(), LocalDate.now());
        int expected = period.getYears();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AgeDateAfterToday0() 
    {
        Deer deer = new Deer("Ми", LocalDate.of(2026, 12, 12), Type.лань);
       
        int actual = deer.Age();

        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}