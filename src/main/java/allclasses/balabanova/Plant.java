package allclasses.balabanova;

import java.util.List;

public class Plant {

    // Метод для получения типов растений в зависимости от их категории
    public List<String> getTypes(String plantCategory) throws Exception {
        if ("Цветковые".equals(plantCategory)) {
            return List.of("Роза", "Тюльпан", "Лилия");
        } else if ("Всеядные".equals(plantCategory)) {
            return List.of("Папоротник", "Кактус", "Мох");
        } else {
            throw new Exception("Неизвестная категория растения, используйте значение Цветковые или Всеядные.");
        }
    }

    // Метод для получения среды обитания растения
    public String getHabitat(String plantType) throws Exception {
        switch (plantType) {
            case "Роза":
                return "Сады и парки";
            case "Кактус":
                return "Пустыни";
            case "Мох":
                return "Влажные места и леса";
            case "Тюльпан":
                return "Сады и цветники";
            default:
                throw new Exception("Неизвестный тип растения, пожалуйста, используйте: Роза, Кактус, Мох, Тюльпан.");
        }
    }

    // Новый метод для получения способа размножения растения
    public String getReproductionMethod(String plantType) throws Exception {
        switch (plantType) {
            case "Роза":
                return "Семенами или черенками.";
            case "Кактус":
                return "Семенами, а также образованием дочерних растений.";
            case "Папоротник":
                return "Спорами.";
            case "Тюльпан":
                return "Семенами и луковицами.";
            default:
                throw new Exception("Неизвестный тип растения, пожалуйста, используйте: Роза, Кактус, Папоротник, Тюльпан.");
        }
    }

    // Новый метод для получения рекомендаций по уходу за растениями
    public String getCareInstructions(String plantType) throws Exception {
        switch (plantType) {
            case "Роза":
                return "Полив раз в неделю, удобрение в сезон цветения.";
            case "Кактус":
                return "Малый полив, предпочитает солнечные места.";
            case "Мох":
                return "Поддерживать влажность и избегать прямых солнечных лучей.";
            case "Тюльпан":
                return "Полив умеренный, предпочитает солнечное место.";
            default:
                throw new Exception("Неизвестный тип растения, пожалуйста, используйте: Роза, Кактус, Мох, Тюльпан.");
        }
    }
}
