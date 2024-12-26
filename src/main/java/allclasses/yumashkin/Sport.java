package allclasses.yumashkin;

import java.util.List;

public class Sport {
    public List<String> getSport(String sport) throws Exception {
        if ("Хоккей".equals(sport)) {
            return List.of("Шайба", "Клюшка");
        } else if ("Футбол".equals(sport)) {
            return List.of("Футбольный мяч", "Бутсы");
        } else if ("Баскетбол".equals(sport)) {
            return List.of("Баскетбольный мяч", "Кольцо");
        } else {
            throw new Exception("Неизвестный вид спорта");
        }
    }

    public String getPos() {
        return "Есть такие виды позиций в спорте как: нападающий, защитник, вратарь";
    }
}
