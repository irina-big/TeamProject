package allclasses.strelnikov;

public class Capybara {
    // Поля класса
    private String name;
    private int age;
    private double weight;

    // Конструктор
    public Capybara(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // Метод, который заставляет капибару "говорить"
    public void speak() {
        System.out.println(name + " говорит: Хрю-хрю!");
    }

    // Метод, который позволяет капибаре есть
    public void eat(double foodWeight) {
        weight += foodWeight;
        System.out.println(name + " съел " + foodWeight + " кг еды. Теперь весит " + weight + " кг.");
    }

    // Метод, который позволяет капибаре плавать
    public void swim() {
        System.out.println(name + " плавает в озере. Это ее любимое занятие!");
    }

    // Метод, который уменьшает вес капибары (например, после игры)
    public void play(double energySpent) {
        if (weight > energySpent) {
            weight -= energySpent;
            System.out.println(name + " активно поиграл(а) и теперь весит " + weight + " кг.");
        } else {
            System.out.println(name + " слишком устал(а) и не может больше играть.");
        }
    }

    // Метод, который увеличивает возраст капибары
    public void growOlder() {
        age += 1;
        System.out.println(name + " стал(а) старше. Теперь возраст: " + age + " лет.");
    }

    // Метод для отображения информации о капибаре
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг.");
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создаём объект капибары
        Capybara capy = new Capybara("Каппи", 3, 35.5);

        // Тестируем методы
        capy.displayInfo();        // Печатаем информацию
        capy.speak();              // Капибара говорит
        capy.eat(2.0);             // Капибара ест
        capy.swim();               // Капибара плавает
        capy.play(1.5);            // Капибара играет
        capy.growOlder();          // Капибара стареет
        capy.displayInfo();        // Ещё раз печатаем информацию
    }
}
