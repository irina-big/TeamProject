package allclasses.gusev;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthday;
    private int age;
    private String specialty;

    public Student(String name, String surname, LocalDate birthday, String specialty) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.specialty = specialty;
        calculateAge();
        transformSpecialty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        calculateAge();
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
        transformSpecialty();
    }

    private void calculateAge() {
        LocalDate now = LocalDate.now();
        this.age = Period.between(birthday, now).getYears();
        if (now.getMonthValue() < birthday.getMonthValue() ||
                (now.getMonthValue() == birthday.getMonthValue() && now.getDayOfMonth() < birthday.getDayOfMonth())) {
            this.age--;
        }
    }

    private void transformSpecialty() {
        String trimmed = specialty.trim();
        String[] words = trimmed.split("\\s+");
        this.specialty = String.join(" ", words).toUpperCase();
    }

    public int calculateCourse() {
        if (age == 16 || age == 17) return 1;
        if (age == 18 || age == 19) return 2;
        if (age == 20 || age == 21) return 3;
        if (age == 22 || age == 23) return 4;
        if (age < 16 || age > 23) return 0;
        return 0;
    }

    public String studentInfo() {
        int course = calculateCourse();
        return name + " " + surname + " " + course + " " + specialty;
    }
}