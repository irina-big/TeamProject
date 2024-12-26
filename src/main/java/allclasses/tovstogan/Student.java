package allclasses.tovstogan;

public class Student {
    String first_name;
    String second_name;
    int group;

    public int getGroup() {
        return group;
    }
    public Student(String first_name, String second_name, int group){
        this.first_name = first_name;
        this.second_name = second_name;
        this.group = group;
    }
}
