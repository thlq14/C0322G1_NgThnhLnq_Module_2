package _Extra_Exercises._codegym_management.models;

import java.time.LocalDate;

public class Student extends Person {
    private String nameClass;
    private Double point;

    public Student() {
    }

    public Student(String nameClass, Double point) {
        this.nameClass = nameClass;
        this.point = point;
    }

    public Student(String id, String name, LocalDate birth, String gender, String nameClass, Double point) {
        super(id, name, birth, gender);
        this.nameClass = nameClass;
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",
                super.getId(), super.getName(), super.getBirth(), super.getGender(),
                this.getNameClass(), this.getPoint());
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() +
                "nameClass = '" + nameClass + '\'' +
                ", point = " + point +
                '}';
    }
}
