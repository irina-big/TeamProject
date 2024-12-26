package allclasses.Portov;

public class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для представления
    public String introduce() {
        return "Привет, меня зовут " + name + ", мне " + age + " лет.";
    }

    // Метод для увеличения возраста
    public void haveBirthday() {
        age++;
        System.out.println(name + " празднует день рождения! Теперь мне " + age + " лет.");
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }
}
