package _bai_tap_tong_hop.utils;

import _bai_tap_tong_hop.models.NhanVien;

import java.util.Comparator;

public class IncreaseSalaryComparator implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.salaryStaff() > o2.salaryStaff()) {
            return 1;
        } else if (o1.salaryStaff() < o2.salaryStaff()) {
            return -1;
        } else {
            return 1;
        }
    }
}
