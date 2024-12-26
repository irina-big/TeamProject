package gusevtests;
import allclasses.gusev.Student;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class CalculateCourseTests {

    @Test
    public void testCalculateCourse_16To17Age_ReturnsOne() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2007, 1, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testCalculateCourse_18To19Age_ReturnsTwo() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2005, 1, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCalculateCourse_20To21Age_ReturnsThree() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2003, 1, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(3, result);
    }

    @Test
    public void testCalculateCourse_22To23Age_ReturnsFour() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2001, 1, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCalculateCourse_15Age_ReturnsZero() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2009, 1, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCalculateCourse_24Age_ReturnsZero() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2000, 4, 1), "Computer Science");
        int result = student.calculateCourse();
        Assert.assertEquals(0, result);
    }
}