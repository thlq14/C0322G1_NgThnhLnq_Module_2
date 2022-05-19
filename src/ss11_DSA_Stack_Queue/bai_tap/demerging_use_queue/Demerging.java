package ss11_DSA_Stack_Queue.bai_tap.demerging_use_queue;

public class Demerging implements Comparable<Demerging> {
    private String name;
    private boolean gender;
    private int year;

    public Demerging() {
    }

    public Demerging(String name, boolean gender, int year) {
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Demerging {" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                ", year = " + year +
                '}';
    }

    @Override
    public int compareTo(Demerging o) {
        if (this.getYear() > o.getYear()) {
            return 1;
        } else if (this.getYear() < o.getYear()) {
            return -1;
        } else {
            return 1;
        }
    }
}
