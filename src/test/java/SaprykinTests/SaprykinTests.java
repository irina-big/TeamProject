package Saprykin;

import allclasses.saprykin.SaprykinClass;
import org.junit.Assert;
import org.junit.Test;

public class SaprykinTests {

    @Test
    public void testGetStudentInfo() {
        // Создаем объект SaprykinClass
        SaprykinClass student = new SaprykinClass("Семён Сапрыкин", 20, 4.7);

        // Проверяем корректность метода getStudentInfo
        String expectedInfo = "Имя студента: Семён Сапрыкин, Возраст: 20, Средний балл: 4.7";
        Assert.assertEquals(expectedInfo, student.getStudentInfo());
    }

    @Test
    public void testIsExcellentStudent_True() {
        // Создаем объект SaprykinClass с высоким средним баллом
        SaprykinClass student = new SaprykinClass("Семён Сапрыкин", 20, 4.7);

        // Проверяем, что студент является отличником
        Assert.assertTrue(student.isExcellentStudent());
    }

    @Test
    public void testIsExcellentStudent_False() {
        // Создаем объект SaprykinClass с низким средним баллом
        SaprykinClass student = new SaprykinClass("Семён Сапрыкин", 20, 4.2);

        // Проверяем, что студент не является отличником
        Assert.assertFalse(student.isExcellentStudent());
    }

    @Test
    public void testSetAverageGrade() {
        // Создаем объект SaprykinClass
        SaprykinClass student = new SaprykinClass("Семён Сапрыкин", 20, 4.7);

        // Устанавливаем новый средний балл
        student.setAverageGrade(3.5);

        // Проверяем, что средний балл обновился
        Assert.assertEquals(3.5, student.getAverageGrade(), 0.01);
    }
}