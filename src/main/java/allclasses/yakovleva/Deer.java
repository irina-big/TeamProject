package allclasses.yakovleva;

import java.time.LocalDate;
import java.time.Period;

public class Deer 
{
    private String name;
    private LocalDate birthday;
    private Type type;

    public String getName() { return name; }
    public void setName(String _name) { name = _name; }
  
    public LocalDate getBirthday() { return birthday; }
    public void setBirthday(LocalDate _birthday) { birthday = _birthday; }

    public Type getType() { return type; }
    public void setType(Type _type) { type = _type; }

    public Deer()
    {
      name = "-";
      birthday = LocalDate.now();
      type = Type.неизвестно;
    }

    public Deer(String _name, LocalDate _birthday, Type _type)
    {
      name = _name;
      birthday = _birthday;
      type = _type;
    }

    public int Age()
    {
        LocalDate now = LocalDate.now();

        if (now.getYear() < birthday.getYear()) return 0;
        else if (now.getYear() == birthday.getYear())
            if (now.getDayOfYear() <= birthday.getDayOfYear()) return 0;

        return Period.between(birthday, now).getYears();
    }

    public void Info()
    {
        System.out.println("Олень " + this.getName() 
              + "\nДата рождения: " + this.getBirthday() 
              + "\nТип: " + this.getType());
    }
}