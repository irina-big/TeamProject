package allclasses.stebunov;

public class Wolf {

    // Поля класса
    private String name; // Имя волка
    private int age; // Возраст волка
    private double weight; // Вес волка

    // Конструктор по умолчанию
    public Wolf() {
        this.name = "Безымянный";
        this.age = 0;
        this.weight = 0.0;
    }

    // Конструктор с параметрами
    public Wolf(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры
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
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Возраст не может быть отрицательным.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
        {
            this.weight = weight;
        }
        else
        {
            System.out.println("Вес должен быть больше нуля.");
        }
    }

    // Метод для вывода информации о волке
    public void printInfo() {
        System.out.println("Имя волка: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");
    }

    // Метод, чтобы волк выл
    public String howl() {
        return "Волк " + name + " воет: Аууууу!";
    }
}
