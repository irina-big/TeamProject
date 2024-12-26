package allclasses.chernyshova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mouse {
    private String color;         // Цвет мыши
    private String species;       // Вид мыши
    private double weight;        // Вес мыши в граммах
    private LocalDate birthDate;  // Дата рождения

    // Конструктор по умолчанию
    public Mouse() {
        this.color = "серая";
        this.species = "домовая";
        this.weight = 25.0; // Средний вес в граммах
        this.birthDate = LocalDate.now(); // Считаем, что родилась сегодня
    }

    // Конструктор с параметрами
    public Mouse(String color, String species, double weight, LocalDate birthDate) {
        this.color = color;
        this.species = species;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    // Геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес должен быть положительным.");
        }
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate.isBefore(LocalDate.now())) {
            this.birthDate = birthDate;
        } else {
            System.out.println("Дата рождения не может быть в будущем.");
        }
    }

    // Метод для расчета возраста мыши в днях
    public long getAgeInDays() {
        return ChronoUnit.DAYS.between(birthDate, LocalDate.now());
    }

    // Метод для вывода информации о мыши
    public void describeMouse() {
        System.out.println("Вид мыши: " + species);
        System.out.println("Цвет: " + color);
        System.out.println("Вес: " + weight + " грамм");
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Возраст в днях: " + getAgeInDays());
    }

    public static void main(String[] args) {
        Mouse defaultMouse = new Mouse();
        defaultMouse.describeMouse();

        Mouse customMouse = new Mouse("белая", "полевка", 30.5, LocalDate.of(2023, 11, 1));
        customMouse.describeMouse();

        // Пример изменения параметров
        customMouse.setWeight(32.0);
        customMouse.setColor("черная");
        customMouse.describeMouse();
    }
}
