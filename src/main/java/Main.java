import allclasses.fokin.FokinClass;
import allclasses.irinabig.Animal;
import allclasses.irinabig.Cat;
import allclasses.irinabig.Feline;
import allclasses.irinabig.Lion;
import allclasses.petrov.Programmer;
import allclasses.stebunov.Wolf;
import allclasses.yakimovich.YakimovichClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Демонстрация работы классов пакета irinabig
        try {
            showClassesIrinaBig();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        showClassesPetrov();
        showClassesYakimovich();
        showClassesFokin();
        showClassesStebunov();
        showClassesVolodin();
        showClassesBezrukih();
    }
    public static void showClassesIrinaBig() throws Exception {
        System.out.println("\nДемонстрация работы классов Ирины Георгиевны:\n");
        Feline feline = new Feline();
        System.out.println("Создан объект семейства " + feline.getFamily());
        Animal animal = new Animal();
        System.out.println(animal.getFamily());

        Cat cat = new Cat(feline);
        System.out.println("Объект кошка умеет говорить: " + cat.getSound());
        Lion lion = new Lion("Самец", feline);
        System.out.println("Кошка питается => " + cat.getFood().toString());
        System.out.println("Лев питается => " + lion.getFood().toString());
        System.out.println("Кошачьи питаются => " + feline.getFood("Хищник") .toString());
    }

    public  static void showClassesPetrov() {
        System.out.println("\nДемонстрация работы классов Петрова Артёма:\n");
        Programmer programmer = new Programmer("Артем", 18);
        programmer.writeCode();
        programmer.drinkCoffee();
        programmer.debugCode();
    }

    public static void showClassesYakimovich() {
        System.out.println("\nДемонстрация работы класса Якимовича Андрея:\n");
        YakimovichClass test = new YakimovichClass();
        System.out.println("Результаты вычислений YakimovichClass:");
        System.out.println("Сумма 5 + 3 = " + test.add(5, 3));
        System.out.println("Разность 10 - 4 = " + test.subtract(10, 4));
        System.out.println("Произведение 6 * 2 = " + test.multiply(6, 2));
        try {
            System.out.println("Деление 10 / 2 = " + test.divide(10, 2));
            System.out.println("Деление 15 / 0 = " + test.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("Четные числа от 0 до 10: " + test.generateEvenNumbers(10));
    }
    public static void showClassesFokin() {
        System.out.println("\nДемонстрация работы класса Фокина Дениса:\n");
        FokinClass fokinClass = new FokinClass();

        // Выводим сообщение
        fokinClass.printMessage("Привет из группы С224 от Метафоры(Дениса)!");

        // Рассчитываем сумму двух чисел
        int sum = fokinClass.calculateSum(5, 10);
        System.out.println("Сумма 5 и 10 равна: " + sum + ", Ого!");

        // Генерируем массив случайных целых чисел
        int[] randomArray = fokinClass.generateRandomArray(5, 100); // Массив из 5 случайных чисел до 100
        System.out.print("Случайный массив: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }

    public static void showClassesStebunov() {
        System.out.println("\nДемонстрация работы класса Стебунова Никиты:\n");

        // Создание волка с помощью конструктора по умолчанию
        Wolf defaultWolf = new Wolf();
        System.out.println("Волк, созданный с использованием конструктора по умолчанию:");
        defaultWolf.printInfo();

        System.out.println("Изменение имени, возраста и веса волка. Измененный волк:");
        // Изменение параметров волка
        defaultWolf.setName("Белый");
        defaultWolf.setAge(5);
        defaultWolf.setWeight(35.5);
        // Вывод информации о волке
        defaultWolf.printInfo();

        // Создание волка с параметрами
        Wolf customWolf = new Wolf("Серый", 7, 42.3);
        System.out.println("\nВолк, созданный с использованием конструктора с параметрами:");
        customWolf.printInfo();

        // Демонстрация метода howl
        System.out.println("\nДемонстрация метода - Волк воет:");
        System.out.println(defaultWolf.howl());
        System.out.println(customWolf.howl());
    }

    public static void showClassesVolodin() {
        System.out.println("\nДемонстрация работы класса Володина Андрея:\n");

    }
    public static void showClassesBezrukih() {
        System.out.println("\nДемонстрация работы класса Безруких Алексея:\n");
    }
}