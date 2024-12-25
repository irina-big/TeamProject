package allclasses.zolotova;

import java.util.Random;

public class ArcticFox { // Писец (северная лиса)
    private String name;
    private int age;
    private double weight; // Вес писца в килограммах
    private int snowTracksLeft; // Количество оставленных следов на снегу

    // Конструктор по умолчанию
    public ArcticFox() {
        this.name = "Безымянный писец";
        this.age = 3;
        this.weight = 4.5;
        this.snowTracksLeft = 0;
    }

    // Конструктор с параметрами
    public ArcticFox(String name, int age, double weight, int snowTracksLeft) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.snowTracksLeft = snowTracksLeft;
    }

    // Метод: оставлять следы на снегу
    public void leaveTracks() {
        Random random = new Random();
        int tracks = random.nextInt(100) + 1; // Генерация случайного числа следов (от 1 до 100)
        snowTracksLeft += tracks;
        System.out.println(name + " оставил " + tracks + " следов на снегу.");
    }

    // Метод: вывод характеристик писца
    public void printCharacteristics() {
        System.out.println("Характеристики писца:");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Следы на снегу: " + snowTracksLeft);
        System.out.println();
    }

    public static void main(String[] args) {
        // Пример использования класса ArcticFox
        ArcticFox defaultScribe = new ArcticFox();
        defaultScribe.printCharacteristics();
        defaultScribe.leaveTracks();
        defaultScribe.printCharacteristics();

        ArcticFox customScribe = new ArcticFox("Полярник", 5, 6.2, 50);
        customScribe.printCharacteristics();
        customScribe.leaveTracks();
        customScribe.printCharacteristics();
    }
}