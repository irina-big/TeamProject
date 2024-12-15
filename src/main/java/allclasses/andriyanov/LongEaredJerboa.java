package allclasses.andriyanov;
import java.util.Random;

public class LongEaredJerboa {
    public String athleteName; // Поле для хранения имени спортсмена
    public int maxWeight; // Поле для хранения максимального веса, который может поднять спортсмен
    public int attempts; // Поле для хранения количества попыток жима
    public int successfulAttempts; // Поле для хранения количества успешных попыток
    public Random random = new Random(); // Создание объекта Random для генерации случайных чисел

    public LongEaredJerboa(String athleteName, int maxWeight) {
        this.athleteName = athleteName; // Имя спортсмена
        this.maxWeight = maxWeight; // Максимальный вес
        this.attempts = 0; // Инициализация количества попыток в 0
        this.successfulAttempts = 0; // Инициализация количества успешных попыток в 0
    }

    public void attemptLift(int weight) {
        attempts++; // Увеличение счетчика попыток
        System.out.println(athleteName + " пытается поднять " + weight + " кг."); // Вывод сообщения о попытке подъема
        if (weight <= maxWeight) { // Проверка, поднимет ли спортсмен вес
            successfulAttempts++; // Увеличение счетчика успешных попыток
            System.out.println("Успешно!"); // Вывод сообщения об успешной попытке
        } else {
            System.out.println("Неудачная попытка."); // Вывод сообщения о неудачной попытке
        }
    }

    public void  increaseMaxWeight() { // Метод для увеличения максимального веса
        int weightIncrease = random.nextInt(10)+ 5; // Генерация случайного значения увеличения веса от 5 до 14
        maxWeight += weightIncrease; // Увеличение максимального веса на сгенерированное значение
        System.out.println(athleteName + " Увеличил макс. вес на " + weightIncrease + " кг."); // Вывод сообщения об увеличении максимального веса
    }

    public void showStatistics() {
        System.out.println(athleteName + " статистика:"); // Вывод заголовка статистики
        System.out.println("Максимальный вес: " + maxWeight + " кг."); // Вывод максимального веса
        System.out.println("Всего попыток: " + attempts); // Вывод общего количества попыток
        System.out.println("Успешных попыток: " + successfulAttempts); // Вывод количества успешных попыток
    }
}
