package allclasses.Usmonova;
import java.util.Random;
import allclasses.irinabig.Animal;
import java.util.List;
public class Hare extends Animal {

    // Метод, возвращающий поведение зайца
    public String getBehavior() {
        return "Заяцы обычно живут в норах и очень осторожны. Они быстро бегают и могут прыгать на большие расстояния.";
    }

    // Метод, имитирующий поиск пищи в зависимости от времени суток и наличия хищников
    public String searchForFood(String timeOfDay, boolean arePredatorsNearby) {
        if ("День".equals(timeOfDay) && arePredatorsNearby) {
            return "Заяц прячется в норе, так как хищники близко.";
        } else if ("Ночь".equals(timeOfDay)) {
            return "Заяц выходит на поиск пищи, так как хищников нет.";
        } else {
            // При прочих условиях
            String[] foodOptions = {"Трава", "Листья", "Корнеплоды"};
            Random rand = new Random();
            return "Заяц нашёл " + foodOptions[rand.nextInt(foodOptions.length)] + " на пастбище.";
        }
    }

    // Переопределим метод getFood для конкретного животного
    @Override
    public List<String> getFood(String animalKind) throws Exception {
        if ("Заяц".equals(animalKind)) {
            return List.of("Трава", "Листья", "Корнеплоды");
        } else {
            return super.getFood(animalKind);
        }
    }
}