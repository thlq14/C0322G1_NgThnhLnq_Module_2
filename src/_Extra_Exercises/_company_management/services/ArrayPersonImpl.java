package _Extra_Exercises._company_management.services;

import _Extra_Exercises._company_management.models.CongNhat;
import _Extra_Exercises._company_management.models.NhanVien;
import _Extra_Exercises._company_management.models.QuanLy;
import _Extra_Exercises._company_management.models.SanXuat;

import java.util.Scanner;

public class ArrayPersonImpl implements PersonService {
    public static NhanVien[] personList = new NhanVien[1000];
    public static Scanner scanner = new Scanner(System.in);

    static {
        personList[0] = new QuanLy("Nguyễn Z", 1994, "Hà Nội", 20000, 1.8);
        personList[1] = new QuanLy("Phạm J", 1995, "Đà Nẵng", 18000, 1.7);
        personList[2] = new CongNhat("Văn F", 1995, "Đà Nẵng", 30);
        personList[3] = new CongNhat("Trần W", 1996, "Tp HCM", 29);
        personList[4] = new SanXuat("Nguyễn K", 1997, "Tp HCM", 500);
        personList[5] = new SanXuat("Văn I", 1998, "Hà Nội", 470);
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
    }

    @Override
    public void displayListNameByIncrease() {
    }

    @Override
    public void displayListNameByDecrease() {
    }

    @Override
    public void displayListSorted() {
    }
}
