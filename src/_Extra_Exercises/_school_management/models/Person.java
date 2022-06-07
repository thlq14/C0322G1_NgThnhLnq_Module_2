package _Extra_Exercises._school_management.models;

import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String name;
    private String gender;
    private LocalDate birth;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String gender, LocalDate birth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "id = " + id +
                ", name = '" + name + '\'' +
                ", gender = '" + gender + '\'' +
                ", birth = " + birth +
                ", address = '" + address + '\'';
    }
}
