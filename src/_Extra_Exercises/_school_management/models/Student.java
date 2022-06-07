package _Extra_Exercises._school_management.models;

import java.time.LocalDate;

public class Student extends Person {
    private String StudentId;
    private double pointAvg;

    public Student() {
    }

    public Student(int id, String name, String gender, LocalDate birth, String address) {
        super(id, name, gender, birth, address);
    }

    public Student(String studentId, double pointAvg) {
        this.StudentId = studentId;
        this.pointAvg = pointAvg;
    }

    public Student(int id, String name, String gender, LocalDate birth, String address, String studentId, double pointAvg) {
        super(id, name, gender, birth, address);
        this.StudentId = studentId;
        this.pointAvg = pointAvg;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public double getPointAvg() {
        return pointAvg;
    }

    public void setPointAvg(double pointAvg) {
        this.pointAvg = pointAvg;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() +
                ", StudentId = '" + StudentId + '\'' +
                ", pointAvg = " + pointAvg +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(), super.getName(), super.getGender(), super.getBirth(), super.getAddress(),
                this.getStudentId(), this.getPointAvg());
    }
}
