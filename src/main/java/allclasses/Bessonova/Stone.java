package allclasses.Bessonova;

public class Stone {
    private String color;
    private String mood;
    private int roughnessLevel;
    private boolean spikiness;
    private String habitat;

    // Конструктор по умолчанию
    public Stone() {
        this.color = "Серый";
        this.mood = "Нейтральное";
        this.roughnessLevel = 50;
        this.spikiness = false;
        this.habitat = "Горы";
    }

    // Конструктор с параметрами
    public Stone(String color, String mood, int roughnessLevel, boolean spikiness, String habitat) {
        this.color = color;
        this.mood = mood;
        this.roughnessLevel = roughnessLevel;
        this.spikiness = spikiness;
        this.habitat = habitat;
    }

    // Метод для просмотра характеристик камня
    public void printCharacteristics() {
        System.out.println("Характеристики камня:");
        System.out.println("Цвет: " + color);
        System.out.println("Настроение: " + mood);
        System.out.println("Уровень шершавости: " + roughnessLevel);
        System.out.println("Колючесть: " + (spikiness ? "Да" : "Нет"));
        System.out.println("Среда обитания: " + habitat);
        System.out.println();
    }

    // Метод для намокания камня (уменьшает уровень шершавости)
    public void soak() {
        if (roughnessLevel >= 10) {
            roughnessLevel -= 10;
            System.out.println("Камень намок! Уровень шершавости уменьшен на 10.");
        } else {
            roughnessLevel = 0;
            System.out.println("Камень намок и стал полностью гладким!");
        }
    }
}
