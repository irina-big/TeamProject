package allclasses.buravlev;

public class Pet {
    int weight;
    String type;
    int age;
    String name;

    public Pet(String name, int weight, String type, int age)
    {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.age = age;
    }
    public String getInfo()
    {
        return  "Type: " + type + ", Weight: " + weight + " kg, Age: " + age + " years";
    }
    public boolean isAdult()
    {
        return  age >= 1;
    }

}
