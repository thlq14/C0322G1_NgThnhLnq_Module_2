package _bai_tap_tong_hop.models;

public abstract class NhanVien {
    private String name;
    private int birth;
    private String address;

    public NhanVien() {
    }

    public NhanVien(String name, int birth, String address) {
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double salaryStaff();

    @Override
    public String toString() {
        return "" +
                "name = '" + name + '\'' +
                ", birth = " + birth +
                ", address = '" + address + '\'';
    }
}
