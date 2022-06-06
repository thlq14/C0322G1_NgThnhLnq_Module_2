package _Extra_Exercises._staff_management.models;

import java.time.LocalDate;

public abstract class Staff {
    private int id;
    private String staffId;
    private String name;
    private LocalDate birth;
    private String address;

    public Staff() {
    }

    public Staff(int id, String staffId, String name, LocalDate birth, String address) {
        this.id = id;
        this.staffId = staffId;
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
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
                ", staffId = '" + staffId + '\'' +
                ", name = '" + name + '\'' +
                ", birth = " + birth +
                ", address = '" + address;
    }
}
