package ryzhkina;

public class Raccoon {
    private String name;
    private String type;

    public Raccoon(String name, String type){
        this.name=name;
        this.type = type;
    }

    public String getName()
    { return name; }
    public String getType()
    { return type; }

    public String getInfo(){
        return ("Енот " + this.getName()
                + "\nТип енота: " + this.getType());
    }
}
