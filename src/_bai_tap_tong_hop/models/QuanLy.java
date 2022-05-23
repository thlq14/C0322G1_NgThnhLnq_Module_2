package _bai_tap_tong_hop.models;

public class QuanLy extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public QuanLy() {
    }

    public QuanLy(double luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public QuanLy(String name, int birth, String address, double luongCoBan, double heSoLuong) {
        super(name, birth, address);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double salaryStaff() {
        return this.heSoLuong * this.luongCoBan;
    }

    @Override
    public String toString() {
        return "QuanLy {" + super.toString() +
                ", luongCoBan = " + luongCoBan +
                ", heSoLuong = " + heSoLuong +
                ", luong = " + salaryStaff() +
                '}';
    }
}
