package _Extra_Exercises._company_management.utils;

import _Extra_Exercises._company_management.models.NhanVien;

import java.util.Comparator;

public class DecreaseNameComparator implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
