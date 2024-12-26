package allclasses.hrustaliova;

public class Rat {

    private String name;
    private int weight;
    private boolean isHungry;


    // Конструктор
    public Rat(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.isHungry = true; // Крысы обычно голодны по умолчанию
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес крысы не может быть отрицательным.");
        }
    }


    public boolean isHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // Метод для кормления крысы
    public void feed(int foodAmount) {
        if (foodAmount > 0) {
            weight += foodAmount;
            isHungry = false;
            System.out.println(name + " съела " + foodAmount + " единиц еды.");
        } else {
            System.out.println("Количество еды должно быть положительным.");
        }
    }


    // Метод для описания крысы
    public String describe() {
        return "Имя: " + name + ", Вес: " + weight + ", Голодная: " + isHungry;
    }

    public static void main(String[] args) {
        Rat rat1 = new Rat("Рафик", 150);
        System.out.println(rat1.describe()); //Вывод описания крысы
        rat1.feed(50); //Кормление крысы
        System.out.println(rat1.describe()); //Вывод описания крысы после кормления

        Rat rat2 = new Rat("Ромка", 200);
        System.out.println(rat2.describe()); // Вывод описания другой крысы
        rat2.setWeight(-10); //Попытка установить отрицательный вес
        System.out.println(rat2.describe()); // Вывод описания после попытки установить отрицательный вес
    }
}
