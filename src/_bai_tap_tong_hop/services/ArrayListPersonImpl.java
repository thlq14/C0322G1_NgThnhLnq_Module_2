package _bai_tap_tong_hop.services;

import _bai_tap_tong_hop.models.NhanVien;
import _bai_tap_tong_hop.models.QuanLy;
import _bai_tap_tong_hop.models.CongNhat;
import _bai_tap_tong_hop.models.SanXuat;
import _bai_tap_tong_hop.utils.DecreaseNameComparator;
import _bai_tap_tong_hop.utils.IncreaseNameComparator;
import _bai_tap_tong_hop.utils.IncreaseSalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListPersonImpl implements PersonService {
    public static List<NhanVien> personList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
        personList.add(new QuanLy("Nguyễn Z", 1994, "Hà Nội", 20000, 1.8));
        personList.add(new QuanLy("Phạm J", 1995, "Đà Nẵng", 18000, 1.7));
        personList.add(new CongNhat("Văn F", 1995, "Đà Nẵng", 30));
        personList.add(new CongNhat("Trần W", 1996, "Tp HCM", 29));
        personList.add(new SanXuat("Nguyễn K", 1997, "Tp HCM", 500));
        personList.add(new SanXuat("Văn I", 1998, "Hà Nội", 470));
    }

    @Override
    public void displayListAll() {
        for (NhanVien item : personList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListQuanly() {
        for (NhanVien item : personList) {
            if (item instanceof QuanLy) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListCongNhat() {
        for (NhanVien item : personList) {
            if (item instanceof CongNhat) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListSanXuat() {
        for (NhanVien item : personList) {
            if (item instanceof SanXuat) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListSalaryByIncrease() {
        Collections.sort(personList, new IncreaseSalaryComparator());
        for (NhanVien item : personList) {
            System.out.println(item);
        }
    }

    @Override
    public void displayListNameByIncrease() {
        Collections.sort(personList, new IncreaseNameComparator());
        for (NhanVien item : personList) {
            System.out.println(item);
        }
    }

    @Override
    public void displayListNameByDecrease() {
        Collections.sort(personList, new DecreaseNameComparator());
        for (NhanVien item : personList) {
            System.out.println(item);
        }
    }
    public void displayListSorted() {
        for (int i = 0; i < personList.size(); i++) {
            for (int j = i + 1; j < personList.size(); j++) {
                if (personList.get(i) != null && personList.get(i).salaryStaff() == personList.get(j).salaryStaff()) {
                    Collections.sort(personList, new DecreaseNameComparator());
                } else {
                    Collections.sort(personList, new IncreaseSalaryComparator());
                }
            }
        }
        for (NhanVien item : personList) {
            System.out.println(item);
        }
    }
}
