package gusevtests;
import allclasses.gusev.Student;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class StudentInfoTests {

    @Test
    public void testStudentInfo_ReturnsCorrectCourse() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2006, 1, 1), "Computer Science");
        String result = student.studentInfo();
        Assert.assertEquals("Борис Барсов 2 COMPUTER SCIENCE", result);
    }

    @Test
    public void testStudentInfo_ReturnsNotCorrect_NameOfTheSpecialityInLowercase() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2000, 1, 1), "Computer Science");
        String result = student.studentInfo();
        Assert.assertNotEquals("Борис Барсов 0 Computer Science", result);
    }

    @Test
    public void testStudentInfo_ReturnsNotCorrectCourse() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2000, 1, 1), "Computer Science");
        String result = student.studentInfo();
        Assert.assertNotEquals("Борис Барсов 2 COMPUTER SCIENCE", result);
    }

    @Test
    public void testStudentInfo_ReturnsNotCorrectCourseAndNameOfTheSpecialityInLowercase() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2000, 1, 1), "Computer Science");
        String result = student.studentInfo();
        Assert.assertNotEquals("Борис Барсов 5 Computer Science", result);
    }

    @Test
    public void testStudentInfo_ReturnsNotCorrect_Name() {
        Student student = new Student("Борис", "Барсов", LocalDate.of(2006, 1, 1), "Computer Science");
        String result = student.studentInfo();
        Assert.assertNotEquals("Борис Гусев 2 COMPUTER SCIENCE", result);
    }
}