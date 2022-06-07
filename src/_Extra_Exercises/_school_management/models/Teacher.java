package _Extra_Exercises._school_management.models;

import java.time.LocalDate;

public class Teacher extends Person {
    private String classTeach;
    private double salaryTeach;
    private double hourTeach;

    public Teacher() {
    }

    public Teacher(int id, String name, String gender, LocalDate birth, String address) {
        super(id, name, gender, birth, address);
    }

    public Teacher(String classTeach, double salaryTeach, double hourTeach) {
        this.classTeach = classTeach;
        this.salaryTeach = salaryTeach;
        this.hourTeach = hourTeach;
    }

    public Teacher(int id, String name, String gender, LocalDate birth, String address, String classTeach, double salaryTeach, double hourTeach) {
        super(id, name, gender, birth, address);
        this.classTeach = classTeach;
        this.salaryTeach = salaryTeach;
        this.hourTeach = hourTeach;
    }

    public String getClassTeach() {
        return classTeach;
    }

    public void setClassTeach(String classTeach) {
        this.classTeach = classTeach;
    }

    public double getSalaryTeach() {
        return salaryTeach;
    }

    public void setSalaryTeach(double salaryTeach) {
        this.salaryTeach = salaryTeach;
    }

    public double getHourTeach() {
        return hourTeach;
    }

    public void setHourTeach(double hourTeach) {
        this.hourTeach = hourTeach;
    }

    @Override
    public String toString() {
        return "Teacher {" + super.toString() +
                ", classTeach = '" + classTeach + '\'' +
                ", salaryTeach = " + salaryTeach +
                ", hourTeach = " + hourTeach +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(), super.getName(), super.getGender(), super.getBirth(), super.getAddress(),
                this.getClassTeach(), this.getSalaryTeach(), this.getHourTeach());
    }
}
