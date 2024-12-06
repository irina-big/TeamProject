package allclasses.gavrilov;

import java.util.List;

public class Cats {
    String _catName;
    List<String> _catList = List.of("Мурзик", "Барсик", "Снежок", "Пушок", "Борис");

    public Cats(String catName){
        _catName = catName;
    }

    public String CheckCat(){
        for (String cat : _catList) {
            if (_catName.equals(cat)) {
                return "Ваш кот есть в базе данных";
            }
        }
        return "Вашего кота нет в базе данных";
    }
}