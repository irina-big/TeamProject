import allclasses.shepelev.shep;
import allclasses.tovstogan.Student;
import allclasses.tovstogan.Tovstogan;
import allclasses.irinabig.*;
import allclasses.petrov.Programmer;
import allclasses.Baranov.Baranov;
import allclasses.smirnova.Seal;
import allclasses.stebunov.Wolf;
import allclasses.strelnikov.Capybara;
import allclasses.fokin.FokinClass;
import allclasses.yakimovich.YakimovichClass;
import allclasses.antonov.Bear;
import allclasses.yakovleva.*;
import allclasses.chernyshova.Mouse;
import allclasses.ravilova.RavilovaClass;
import allclasses.zolina.Snake;
import allclasses.gavrilov.Cats;
import allclasses.saprykin.SaprykinClass;
import allclasses.yaropolov.Bebra;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Демонстрация работы классов пакета irinabig
        try {
            showClassesIrinaBig();
            showClassesTovstogan();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        showClassesPetrov();
        showClassesBaranov();
        showClassesStebunov();
        showClassesFokin();
        showClassesYakimovich();
        showClassesAntonov();
        showClassesYakovleva();
        showClassesVolodin();
        showClassesBezrukih();
        showClassesChernyshova();
        showClassesRavilova();
        showClassesStrelnikov();
        showClassesSmirnova();
        showClassesZolina();
        showClassesGavrilov();
        showClassesShepelev();
        showClassesYaropolov();

    }

    public static void showClassesIrinaBig() throws Exception {
        System.out.println("\nДемонстрация работы классов Ирины Георгиевны:");
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

    public static void showClassesYaropolov() {
        System.out.println("\nДемонстрация работы классов Ярополова Владислава:");

        // Создаем объект Bebra с начальным количеством трофеев
        Bebra player1 = new Bebra("Игрок 1", 1000);
        System.out.println("Игрок: " + player1.playerName + ", Трофеи: " + player1.trophies + ", Боев сыграно: " + player1.battlesPlayed + ", Побед: " + player1.battlesWon);

        // Играем несколько боев
        player1.playBattle(true);
        System.out.println("Игрок: " + player1.playerName + ", Трофеи: " + player1.trophies + ", Боев сыграно: " + player1.battlesPlayed + ", Побед: " + player1.battlesWon);

        player1.playBattle(false);
        System.out.println("Игрок: " + player1.playerName + ", Трофеи: " + player1.trophies + ", Боев сыграно: " + player1.battlesPlayed + ", Побед: " + player1.battlesWon);

        player1.playBattle(true);
        System.out.println("Игрок: " + player1.playerName + ", Трофеи: " + player1.trophies + ", Боев сыграно: " + player1.battlesPlayed + ", Побед: " + player1.battlesWon);

        // Выводим статистику игрока 1
        player1.showStatistics();

        // Создаем второго игрока и проводим с ним ряд действий
        Bebra player2 = new Bebra("Игрок 2", 500);
        System.out.println("Игрок: " + player2.playerName + ", Трофеи: " + player2.trophies + ", Боев сыграно: " + player2.battlesPlayed + ", Побед: " + player2.battlesWon);

        player2.playBattle(false);
        System.out.println("Игрок: " + player2.playerName + ", Трофеи: " + player2.trophies + ", Боев сыграно: " + player2.battlesPlayed + ", Побед: " + player2.battlesWon);

        // Выводим статистику игрока 2
        player2.showStatistics();

        // Сбрасываем трофеи у первого игрока
        player1.resetTrophies();
        System.out.println("Игрок: " + player1.playerName + ", Трофеи: " + player1.trophies + ", Боев сыграно: " + player1.battlesPlayed + ", Побед: " + player1.battlesWon);
    }

    public  static void showClassesPetrov() {
        System.out.println("\nДемонстрация работы классов Петрова Артёма:");
        Programmer programmer = new Programmer("Артем", 18);
        programmer.writeCode();
        programmer.drinkCoffee();
        programmer.debugCode();
    }

    public static void showClassesYakimovich() {
        System.out.println("\nДемонстрация работы класса Якимовича Андрея:");
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
        System.out.println("\nДемонстрация работы класса Фокина Дениса:");
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

    public  static void showClassesAntonov() {
        Bear bear = new Bear("Antonov", 10, 2000);
        bear.yourRank();
        bear.playGame(); // Сыграли 1 игру
        bear.playGame(); // Сыграли еще 1 игру
        bear.playGame();
        bear.losePts();
        bear.whoAreYou();
    }


    public static void showClassesStebunov() {
        System.out.println("\nДемонстрация работы класса Стебунова Никиты:");

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

    public static void showClassesYakovleva() {
        System.out.println("\nДемонстрация работы класса Яковлевой Анны:");

        // Создание оленя с помощью конструктора по умолчанию
        Deer deer = new Deer("Lin", LocalDate.of(2020, 11, 3), Type.благородный);
        deer.Info();

        // Изменение параметров оленя
        deer.setName("Linnie");
        System.out.println("Изменение имени..");
        deer.Info();

        // Демонстрация метода Age
        System.out.println("Возраст оленя на данный момент: " + deer.Age());
    }

    public static void showClassesVolodin() {
        System.out.println("\nДемонстрация работы класса Володина Андрея:\n");
    }

    public static void showClassesBezrukih() {
        System.out.println("\nДемонстрация работы класса Безруких Алексея:\n");

    }

    public static void showClassesChernyshova() {
        System.out.println("\nДемонстрация работы классов Чернышовой Софьи:\n");

        // Создаем объект пользовательской мыши
        Mouse customMouse = new Mouse("белая", "полевка", 30.5, LocalDate.of(2023, 11, 1));
        System.out.println("Создан объект пользовательской мыши:");
        customMouse.describeMouse();

        // Проверяем возраст в днях
        System.out.println("\nВозраст пользовательской мыши в днях: " + customMouse.getAgeInDays());

        // Проверка с неверной датой рождения
        System.out.println("\nПопытка установить будущую дату рождения:");
        customMouse.setBirthDate(LocalDate.now().plusDays(1));
        System.out.println("Дата рождения после проверки: " + customMouse.getBirthDate());
    }
    public static void showClassesRavilova() {
        System.out.println("\nДемонстрация работы класса Равиловой:\n");
        RavilovaClass ravilovaClass = new RavilovaClass();

        // Демонстрация метода addNumbers
        System.out.println("Сложение 7 + 5 = " + ravilovaClass.addNumbers(7, 5));

        // Демонстрация метода countWords
        String sentence = "Сегодня вторник, завтра среда";
        System.out.println("Количество слов в строке \"" + sentence + "\" = " + ravilovaClass.countWords(sentence));

        // Демонстрация метода findMax
        int[] numbers = {2, 8, 1, 15, 6};
        System.out.println("Максимальное число в массиве {2, 8, 1, 15, 6} = " + ravilovaClass.findMax(numbers));

        // Демонстрация обработки исключения для findMax
        try {
            System.out.println("Максимальное число в пустом массиве: " + ravilovaClass.findMax(new int[]{}));
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void showClassesStrelnikov(){
        System.out.println("\nДемонстрация работы классов Стрельникова Максима:\n");
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

    public static void showClassesSmirnova(){
        System.out.println("\nДемонстрация работы классов Смирновой Ирины:\n");
        Seal defaultSeal = new Seal();
        defaultSeal.triks();

        Seal customSeal = new Seal("Петя", 5, 24, 100);
        customSeal.triks();
    }
    public static void showClassesZolina(){
        System.out.println("\nДемонстрация работы классов Золиной Виктории:\n");
        // Создаем три змеи
        Snake cobra = new Snake("Кобра", 5, 300, 2);
        Snake python = new Snake("Питон", 3, 250, 5);
        Snake boa = new Snake("Удав", 6, 400, 3);

        // Каждая змея шипит
        cobra.printCharacteristics(); // Вывод характеристик змеи
        cobra.hiss();

        python.printCharacteristics(); // Вывод характеристик змеи
        python.hiss();

        boa.printCharacteristics(); // Вывод характеристик змеи
        boa.hiss();
    }

    public static void showClassesGavrilov() {
        System.out.println("\nДемонстрация работы класса Гаврилова Романа:\n");

        Cats trueCat = new Cats("Борис");
        Cats falseCat = new Cats("Феликс");

        System.out.println(trueCat.CheckCat());
        System.out.println(falseCat.CheckCat());
    }


    public static void showClassesBaranov() {
        System.out.println("\nДемонстрация работы класса Баранова Кирилла:\n");
        Baranov baranov = new Baranov();

        // Пример использования методов
        int sum = baranov.add(5, 3);
        int product = baranov.multiply(5, 3);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
  
    public static void showClassesTovstogan() {
        System.out.println("\nДемонстрация работы класса Товстогана Святослава:\n");
        Tovstogan T = new Tovstogan();
        Student S = new Student("Имя", "Фамилия", 222);
        // Пример использования методов
        System.out.println(T.returnHello());
        System.out.println(S.getGroup());
    }

    public static void showClassesShepelev() {
        System.out.println("\nДемонстрация работы класса Шепелева Егора:\n");

        shep trueDog = new shep("Макс");
        shep falseDog = new shep("Гриша");

        System.out.println(trueDog.CheckDog());
        System.out.println(falseDog.CheckDog());
    }
	
	public static void showClassesSaprykin() {
        System.out.println("\nДемонстрация работы класса Сапрыкина Семёна:");

        // Создаем объект класса SaprykinClass
        SaprykinClass student = new SaprykinClass("Семён Сапрыкин", 20, 4.7);

        // Выводим информацию о студенте
        System.out.println(student.getStudentInfo());

        // Проверяем, является ли студент отличником
        if (student.isExcellentStudent()) {
            System.out.println(student.getName() + " - отличник.");
        } else {
            System.out.println(student.getName() + " - не отличник.");
        }

        // Изменяем средний балл студента
        student.setAverageGrade(4.2);
        System.out.println("Обновленный средний балл: " + student.getAverageGrade());

        // Снова проверяем, является ли студент отличником
        if (student.isExcellentStudent()) {
            System.out.println(student.getName() + " - отличник.");
        } else {
            System.out.println(student.getName() + " - не отличник.");
        }
    }
}
