package allclasses.zolina;
import java.util.Random;

public class Snake {
    private String kind;
    private int age;
    private int length;
    private int apple; //Сколько яблок она скормила Еве

    public Snake() {
        this.kind = "Удав";
        this.age = 2;
        this.length = 60;
        this.apple = 1;
    }

    public Snake(String kind, int age, int length, int apple) {
        this.kind = kind;
        this.age = age;
        this.length = length;
        this.apple = apple;
    }

    // Метод: змея шипит
    public void hiss() {
        String hissSound;
        switch (kind) {
            case "Кобра":
                hissSound = "Шипение: Шшшш...";
                break;
            case "Удав":
                hissSound = "Шипение: Сссс...";
                break;
            case "Гадюка":
                hissSound = "Шипение: Тсссстстсс...";
                break;
            case "Анаконда":
                hissSound = "Шипение: Хрпшарара...";
                break;
            case "Питон":
                hissSound = "Шипение: *застенчиво молчит*";
                break;
            default:
                hissSound = "Шипение: зщвавщц... Я неизвестный вид змеи!";
        }
        System.out.println(hissSound);
    }

    // Метод для вывода характеристик змеи
    public void printCharacteristics() {
        System.out.println("Характеристики змеи:");
        System.out.println("Вид: " + kind);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Длина: " + length + " см");
        System.out.println("Яблоки, которые она скормила Еве: " + apple);
        System.out.println();
    }
}