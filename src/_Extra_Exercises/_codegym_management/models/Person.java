package _Extra_Exercises._codegym_management.models;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String name;
    private LocalDate birth;
    private String gender;

    public Person() {
    }

    public Person(String id, String name, LocalDate birth, String gender) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Person " +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", birth = " + birth +
                ", gender = '" + gender;
    }
}
