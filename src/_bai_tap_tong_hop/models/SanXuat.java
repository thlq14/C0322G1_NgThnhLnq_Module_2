package _bai_tap_tong_hop.models;

public class SanXuat extends NhanVien {
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
                ", luong = " + salaryStaff() +
                '}';
    }
    @Override
    public double salaryStaff() {
        return this.soSanPham * 50.000;
    }
}
