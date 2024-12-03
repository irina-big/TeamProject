import allclasses.irinabig.Animal;
import allclasses.irinabig.Cat;
import allclasses.irinabig.Feline;
import allclasses.irinabig.Lion;
import allclasses.strelnikov.Capybara;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Демонстрация работы классов пакета irinabig
        try {
            showClassesIrinaBig();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        showClassesStrelnikov();

    }
    public  static void showClassesIrinaBig() throws Exception {
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

    public static void showClassesStrelnikov(){
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