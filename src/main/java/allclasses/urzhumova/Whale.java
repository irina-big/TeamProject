package allclasses.urzhumova;

import allclasses.irinabig.Animal;
import allclasses.irinabig.Predator;

import java.util.List;

public class Whale extends Animal implements Predator {
    public int weight;
    public Whale()
    {
        weight = 150;
    }
    public Whale(int weight)
    {
        this.weight = weight;
    }
    public List<String> eatMeat() throws Exception {
        return List.of("Планктон", "Креветки");
    }
    public String getSound() {
        return "*жесткие звуки ультразвука*";
    }
    public static String compare(Whale whale1, Whale whale2) {
        if (whale1.weight == whale2.weight)
            return "Киты равны";
        if (whale1.weight > whale2.weight)
            return "Первый кит больше второго";
        return "Второй кит больше первого";
    }
}
