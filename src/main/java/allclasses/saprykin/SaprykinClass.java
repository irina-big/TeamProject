package allclasses.saprykin;

// Класс для описания студента
public class SaprykinClass {
    private String name; // Имя студента
    private int age; // Возраст студента
    private double averageGrade; // Средний балл студента

    // Конструктор
    public SaprykinClass(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    // Метод для получения информации о студенте
    public String getStudentInfo() {
        return "Имя студента: " + name + ", Возраст: " + age + ", Средний балл: " + averageGrade;
    }

    // Метод для проверки, является ли студент отличником
    public boolean isExcellentStudent() {
        return averageGrade >= 4.5;
    }

    // Геттеры и сеттеры для работы с полями
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}