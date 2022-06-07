package _Extra_Exercises._staff_management.models;

import java.time.LocalDate;

public class Manager extends Staff {
    private double basicSalary;
    private double coefficientSalary;

    public Manager() {
    }

    public Manager(double basicSalary, double coefficientSalary) {
        this.basicSalary = basicSalary;
        this.coefficientSalary = coefficientSalary;
    }

    public Manager(int id, String staffId, String name, LocalDate birth, String address, double basicSalary, double coefficientSalary) {
        super(id, staffId, name, birth, address);
        this.basicSalary = basicSalary;
        this.coefficientSalary = coefficientSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(), super.getStaffId(), super.getName(), super.getBirth(), super.getAddress(),
                this.getBasicSalary(), this.getCoefficientSalary(), "Manager");
    }

    @Override
    public String toString() {
        return "Manager {" + super.toString() +
                "', basicSalary = " + basicSalary +
                ", coefficientSalary = " + coefficientSalary +
                '}';
    }
}
