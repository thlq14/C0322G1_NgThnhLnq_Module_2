package _Extra_Exercises._company_management.models;

import java.math.BigDecimal;

public class CongNhat extends NhanVien {
    private int soNgayCong;

    public CongNhat() {
    }

    public CongNhat(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public CongNhat(String name, int birth, String address, int soNgayCong) {
        super(name, birth, address);
        this.soNgayCong = soNgayCong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double salaryStaff() {
        return this.soNgayCong * 120000;
    }

    @Override
    public String toString() {
        return "CongNhat {" + super.toString() +
                ", soNgayCong = " + soNgayCong +
                ", luong = " + new BigDecimal(salaryStaff()) +
                '}';
    }
}
