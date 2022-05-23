package _bai_tap_tong_hop.utils;

import _bai_tap_tong_hop.models.NhanVien;

import java.util.Comparator;

public class IncreaseNameComparator implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
