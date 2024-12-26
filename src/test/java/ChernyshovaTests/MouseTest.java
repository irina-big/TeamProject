package ChernyshovaTests;

import allclasses.chernyshova.Mouse;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MouseTest {

    @Test
    public void testDefaultMouse() {
        Mouse defaultMouse = new Mouse();
        assertEquals("серая", defaultMouse.getColor());
        assertEquals("домовая", defaultMouse.getSpecies());
        assertEquals(25.0, defaultMouse.getWeight(), 0.01);
        assertEquals(LocalDate.now(), defaultMouse.getBirthDate());
    }

    @Test
    public void testCustomMouse() {
        LocalDate birthDate = LocalDate.of(2023, 11, 1);
        Mouse customMouse = new Mouse("белая", "полевка", 30.5, birthDate);
        assertEquals("белая", customMouse.getColor());
        assertEquals("полевка", customMouse.getSpecies());
        assertEquals(30.5, customMouse.getWeight(), 0.01);
        assertEquals(birthDate, customMouse.getBirthDate());
    }

    @Test
    public void testSetWeight() {
        Mouse mouse = new Mouse();
        mouse.setWeight(-10.0); // установка отрицательного веса
        assertEquals(25.0, mouse.getWeight(), 0.01);
    }

    @Test
    public void testAgeCalculate() {
        LocalDate birthDate = LocalDate.of(2024, 1, 1);
        Mouse mouse = new Mouse("серая", "домовая", 20.0, birthDate);
        long expectedAge = LocalDate.now().toEpochDay() - birthDate.toEpochDay();
        assertEquals(expectedAge, mouse.getAgeInDays());
    }

    @Test
    public void testSetFalseBirthDate() {
        Mouse mouse = new Mouse();
        LocalDate futureDate = LocalDate.now().plusDays(1);
        mouse.setBirthDate(futureDate); // установка будущего значения
        assertNotEquals(futureDate, mouse.getBirthDate());
    }
}
