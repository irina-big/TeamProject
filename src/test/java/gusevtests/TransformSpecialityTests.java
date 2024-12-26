package gusevtests;
import allclasses.gusev.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.time.LocalDate;


@RunWith(Parameterized.class)
public class TransformSpecialityTests {
    private final String specialty;
    private final String expected;
    public TransformSpecialityTests(String specialty, String expected){
        this.specialty = specialty;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"  09.02.07    Информационные    системы     и      программирование   ", "09.02.07 ИНФОРМАЦИОННЫЕ СИСТЕМЫ И ПРОГРАММИРОВАНИЕ"},
                {"Информационные системы и программирование", "ИНФОРМАЦИОННЫЕ СИСТЕМЫ И ПРОГРАММИРОВАНИЕ"},
                {"     админИстРИрование           ", "АДМИНИСТРИРОВАНИЕ"},
                {"     administration      123     ", "ADMINISTRATION 123"}
        };
    }
    @Test
    public void transformSpecialtyReturnsStringTest() {
        LocalDate birthday = LocalDate.of(2005, 3, 23);
        Student student = new Student("Peter1", "Belov", birthday, specialty);
        String result = student.getSpecialty();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void nameOfSpecialtyChangeAfterCallingTransformTest() {
        LocalDate birthday = LocalDate.of(2005, 3, 23);
        Student student = new Student("Peter1", "Belov", birthday, specialty);
        String result = student.getSpecialty();
        Assert.assertEquals(expected, result);
    }
}