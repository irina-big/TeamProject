package allclasses.smirnova;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seal {
    private String name;
    private int age;
    private int daily_naps; // Количество дневного дрёма
    private double weight;

    private static final String[] TRICKS = {
            "Прыжок через кольцо",
            "Забавный поворот на пузе",
            "Махание ластами",
            "Игра с мячом",
            "Громкое аррр",
            "Кувырок назад",
            "Лежание в кренделе",
            "Пузо-скольз"
    };

    public Seal() {
        this.name = "Крошик";
        this.age = 0;
        this.daily_naps = 1;
        this.weight = 0.0;
    }

    public Seal(String name, int age, int daily_naps, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.daily_naps = 1; // базовое значение
    }

    public void triks() {
        if (age <= 0) {
            System.out.println(name + " слишком маленький, чтобы делать трюки.");
            return;
        }

        System.out.println(name + " сегодня празднует день рождения! Ему " + age + " лет! Он весит всего " + weight +
                " кг... Очень мало для тюленя. Ему придется делать трюки, чтобы кушать рыбку, но он быстро устает и ему нужно много дремать.");

        Random random = new Random();
        int napCount = 0; // Счетчик дрема

        for (int i = 1; i <= age; i++) {
            // Выбор случайного трюка
            String trick = TRICKS[random.nextInt(TRICKS.length)];
            System.out.println("Трюк " + i + ": " + trick);

            // Тюлень идет спать
            napCount++;
            System.out.println(name + " устал и пошел спать. Он подремал уже " + napCount + " раз.");
        }
        System.out.println(name + " закончил с трюками на сегодня и готов кушать рыбку!");
    }

}
