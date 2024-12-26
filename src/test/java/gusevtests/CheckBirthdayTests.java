package gusevtests;
import allclasses.gusev.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckBirthdayTests {
    private final int year;
    private final int month;
    private final int day;
    private final int expected;
    public CheckBirthdayTests(int year, int month, int day, int expected){
        this.year  = year;
        this.month = month;
        this.day = day;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {2025, 3, 23, 0},
                {2009, 12, 8, 0},
                {2006, 12, 8, 2},
                {2004, 12, 8, 3},
                {2000, 12, 8, 0}
        };
    }
    @Test
    public void checkBirthdayReturnsAgeTest() {
        LocalDate birthday = LocalDate.of(year, month, day);
        Student student = new Student("Anna", "Mihailova", birthday, "Информационные системы и программирование");
        int result = student.calculateCourse();
        assertEquals(expected, result);
    }
}