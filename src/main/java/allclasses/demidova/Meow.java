package allclasses.demidova;

public class Meow {
    private String felineType;
    private String name;

    public String getName() { return name; }
    public void setName(String _name) { name = _name; }

    public String getFelineType() { return felineType; }
    public void setFelineType(String _felineType) { felineType = _felineType; }

    public Meow()
    {
        felineType = "рысь";
        name = "Ирис";
    }

    public Meow(String felineType, String name)
    {
        this.name = name;
        this.felineType = felineType;
    }

    public void printInfo() {
        System.out.println("Вид кошачьего: " + felineType);
        System.out.println("Имя: " + name);
    }

    public void miaow() {
        System.out.println(felineType + " " + name + " мяукает... Миу");
    }
}
