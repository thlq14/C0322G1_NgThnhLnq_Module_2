package _Extra_Exercises._codegym_management.models;

import java.time.LocalDate;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String id, String name, LocalDate birth, String gender, String specialize) {
        super(id, name, birth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s",
                super.getId(), super.getName(), super.getBirth(), super.getGender(),
                this.getSpecialize());
    }

    @Override
    public String toString() {
        return "Teacher {" + super.toString() +
                "specialize = '" + specialize + '\'' +
                '}';
    }
}
