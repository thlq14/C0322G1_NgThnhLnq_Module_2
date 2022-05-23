package _Extra_Exercises._company_management.models;

import _Extra_Exercises._company_management.services.ChamCong;

import java.math.BigDecimal;

public class SanXuat extends NhanVien implements ChamCong {
    private int soSanPham;

    public SanXuat() {
    }

    public SanXuat(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public SanXuat(String name, int birth, String address, int soSanPham) {
        super(name, birth, address);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "SanXuat {" + super.toString() +
                ", soSanPham = " + soSanPham +
                ", luong = " + new BigDecimal(salaryStaff()) +
                '}';
    }

    @Override
    public double salaryStaff() {
        return this.soSanPham * 50000;
    }

    @Override
    public void ChamCong() {
        System.out.println("Đã Chấm Công");
    }
}
